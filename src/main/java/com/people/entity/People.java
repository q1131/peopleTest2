package com.people.entity;

public class People {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String address;

    private Integer aslary;

    private Integer idcard;

    private Integer dempId;

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
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAslary() {
        return aslary;
    }

    public void setAslary(Integer aslary) {
        this.aslary = aslary;
    }

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public Integer getDempId() {
        return dempId;
    }

    public void setDempId(Integer dempId) {
        this.dempId = dempId;
    }
}