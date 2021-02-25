package com.sk.page;

import com.github.pagehelper.PageInfo;
import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;


/**
 * @Author jinshi
 * @Date 2021/2/4 11:20
 * @Version 1.0
 */
public class PageUtils {
    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setList(pageInfo.getList());
        pageResult.setCode(ResultEnum.SUCCESS.getCode());
        pageResult.setMessage(ResultEnum.SUCCESS.getMsg());
        return pageResult;
    }
}
