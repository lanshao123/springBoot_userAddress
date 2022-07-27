package com.wh.pojo;

/**
 * @program: springBoot_userAddress
 * @description: address
 * @author: wangheng
 * @create: 2022-07-27 16:23
 **/
public class Address {
    private Integer id;
    private String name;
    private Integer parent_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
}
