package com.wuyiping.domain;

import java.util.List;

public class ResponseMsg<T>{
    private String msg;
    private String code;
    private String desc;
    private Integer pages;
    private Long total;
    private List<T> result;

    public ResponseMsg() {
    }

    public ResponseMsg(String msg, String code, String desc, Integer pages, Long total, List<T> result) {
        this.msg = msg;
        this.code = code;
        this.desc = desc;
        this.pages = pages;
        this.total = total;
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", pages=" + pages +
                ", total=" + total +
                ", result=" + result +
                '}';
    }
}
