package com.wh.pojo;

import javax.persistence.*;

/**
 * @program: springBoot_userAddress
 * @description: UserAdd
 * @author: wangheng
 * @create: 2022-07-27 16:49
 **/
@Table(name = "useradd")
public class UserAdd {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    private String name;
    private String phone;
    @Column(name = "shengId")
    private Integer shengId;
    @Column(name = "shiId")
    private Integer shiId;
    @Column(name = "quId")
    private Integer quId;
    private String addresinfo;
    private Boolean isdefault;
    @Transient
    private String shengname;
    @Transient
    private String shiname;
    @Transient
    private String quname;

    public String getShengname() {
        return shengname;
    }

    public void setShengname(String shengname) {
        this.shengname = shengname;
    }

    public String getShiname() {
        return shiname;
    }

    public void setShiname(String shiname) {
        this.shiname = shiname;
    }

    public String getQuname() {
        return quname;
    }

    public void setQuname(String quname) {
        this.quname = quname;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getShengId() {
        return shengId;
    }

    public void setShengId(Integer shengId) {
        this.shengId = shengId;
    }

    public Integer getShiId() {
        return shiId;
    }

    public void setShiId(Integer shiId) {
        this.shiId = shiId;
    }

    public Integer getQuId() {
        return quId;
    }

    public void setQuId(Integer quId) {
        this.quId = quId;
    }

    public String getAddresinfo() {
        return addresinfo;
    }

    public void setAddresinfo(String addresinfo) {
        this.addresinfo = addresinfo;
    }
}
