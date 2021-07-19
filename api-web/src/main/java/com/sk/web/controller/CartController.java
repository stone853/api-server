package com.sk.web.controller;

import com.sk.model.ResultListModel;
import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Cart;
import com.sk.web.model.CartExample;
import com.sk.web.service.CartService;
import com.sk.web.utils.UserHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.engine.loading.internal.CollectionLoadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Api(tags = "购物车信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/cart")
public class CartController {
    Logger log = LoggerFactory.getLogger(CartController.class);

    @Autowired
    CartService cartService;

    @ApiOperation("查询所有购物车")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<Cart> selectAll(@RequestHeader("token") String token, Cart t){
        return cartService.selectAll(t);
    }

    @ApiOperation("分页查询所有购物车")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,Cart t){
        return cartService.findPage(pageQuery,t);
    }


    @ApiOperation("分页查询所有购物车(相同产品已汇总)")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectGroupByP")
    public PageResult selectGroupByP(@RequestHeader("token") String token,PageRequest pageQuery,Cart t){
        PageResult r = cartService.findPage(pageQuery,t);
        List<Map> list = (List<Map>) r.getList();
        List nList = new ArrayList();
        list.parallelStream().collect(Collectors.groupingBy(o -> (o.get("pid").toString() + o.get("color") + o.get("size")), Collectors.toList())).forEach(
                (id,transfer) -> {
                    transfer.stream().reduce((a,b) -> {
                        Map map = new HashMap();
                        a.forEach((k,v) ->{
                            if (k.equals("count")) {
                                map.put("count",Integer.parseInt(a.get(k).toString()) + Integer.parseInt(b.get(k).toString()));
                            } else {
                                map.put(k,v);
                            }
                        });
                        return  map;
                    }).ifPresent(nList::add);
                });

        Map storeMap = new HashMap();
        storeMap.put("id","1");
        storeMap.put("name","服装店");
        storeMap.put("order",nList);
        List storeList = new ArrayList();
        storeList.add(storeMap);
        r.setList(storeList);
        return r;
    }


    @ApiOperation("查询单个购物车")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Cart",dataTypeClass = Cart.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Cart> selectOne(@RequestHeader("token") String token, Cart t){
        t.setOpenid(UserHelper.getOpenId(token));
        return cartService.selectOne(t);
    }

    @ApiOperation("增加购物车")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Cart",dataTypeClass = Cart.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Cart> insert(@RequestHeader("token") String token, @RequestBody Cart t) {
        t.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        t.setOpenid(UserHelper.getOpenId(token));
        return cartService.insert(t);
    }

    @ApiOperation("删除购物车")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Cart",dataTypeClass = Cart.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Cart> delete(@RequestHeader("token") String token, @RequestBody Cart t){
        return cartService.delete(t);
    }

    @ApiOperation("更新购物车信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Cart",dataTypeClass = Cart.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Cart> update(@RequestHeader("token") String token, @RequestBody Cart t){
        CartExample e = new CartExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return cartService.update(t,e);
    }









}
