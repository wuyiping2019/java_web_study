package com.wuyiping.domain;

/**
 * 封装分页数据
 * */
public class PageDo {
    private Integer pageSize = 1;
    private Integer pageNum = 1000;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}
