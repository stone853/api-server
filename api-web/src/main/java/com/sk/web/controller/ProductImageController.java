package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.config.CrmConfig;
import com.sk.web.model.ProductImage;
import com.sk.web.model.ProductImageExample;
import com.sk.web.service.ProductImageService;
import com.sk.web.utils.FileUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.rmi.server.ExportException;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "产品图片")
@RestController
@RequestMapping("/product_image")
public class ProductImageController {
    Logger log = LoggerFactory.getLogger(ProductImageController.class);

    @Autowired
    ProductImageService productImageService;

    @Autowired
    CrmConfig crmConfig;

    @Resource
    HttpServletResponse response;

    @ApiOperation("查询所有产品图片")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("product",productImageService.selectAll());
        return map;
    }

    @ApiOperation("分页查询所有产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @PostMapping("/v1/selectPage")
    public PageResult selectPage(@RequestBody PageRequest pageQuery){
        return productImageService.findPage(pageQuery);
    }


    @ApiOperation("查询单个产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/selectOne")
    public ResultModel<ProductImage> selectOne(@RequestBody ProductImage t){
        return productImageService.selectOne(t);
    }

    @ApiOperation("增加产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<ProductImage> insert(@RequestBody ProductImage t) {
        return productImageService.insert(t);
    }


    @ApiOperation("上传图片")
    @PostMapping("/v1/upload")
    public ResultModel uploadImg(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String url = crmConfig.getUploadUrl();
        try {
            FileUtil.uploadFile(file.getBytes(),url, fileName);
            //FileUtil.compressImage(crmConfig.getUploadUrl()+ fileName,100);
            FileUtil.uploadFile(FileUtil.compressImage(url+ fileName,100),url, fileName);

            return new ResultModel<ProductImage>().setCode(ResultEnum.SUCCESS.getCode()).setNote("/product_image/vi/getImage?path="+url+fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultModel<ProductImage>().setCode(ResultEnum.ERROR.getCode()).setNote(ResultEnum.ERROR.getMsg());
        }
    }

    @ApiOperation("获取图片")
    @PostMapping("/v1/getImage")
    public void getImage (@RequestParam("path") String path) {
        try {
            File filePic = new File(path);
            if(filePic.exists()){
                FileInputStream is = new FileInputStream(filePic);
                int i = is.available(); // 得到文件大小
                byte data[] = new byte[i];
                is.read(data); // 读数据
                is.close();
                response.setContentType("image/*"); // 设置返回的文件类型
                OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
                toClient.write(data); // 输出数据
                toClient.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


        @ApiOperation("删除产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<ProductImage> delete(@RequestBody ProductImage t){
        return productImageService.delete(t);
    }

    @ApiOperation("更新产品图片")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ProductImage",dataTypeClass = ProductImage.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<ProductImage> update(@RequestBody ProductImage t){
        ProductImageExample e = new ProductImageExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return productImageService.update(t,e);
    }

}
