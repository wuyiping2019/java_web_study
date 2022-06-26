package com.wuyiping.domain;

import com.alibaba.fastjson.support.spring.PropertyPreFilters;

public class User  extends PageDo{
    public static PropertyPreFilters.MySimplePropertyPreFilter includefilter = null;
    static {
        String[] includeProperties = {"name", "age"};
        PropertyPreFilters filters = new PropertyPreFilters();
        PropertyPreFilters.MySimplePropertyPreFilter includefilter = filters.addFilter();
        includefilter.addIncludes(includeProperties);
        User.includefilter = includefilter;
    }
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pageSize=" + getPageSize() +
                ", pageNum=" + getPageNum() +
                ", count=" + getCount() +
                '}';
    }
}
