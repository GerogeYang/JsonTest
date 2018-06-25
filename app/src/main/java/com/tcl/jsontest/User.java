package com.tcl.jsontest;

/**
 * 项目名：   JsonTest
 * 包名：     com.tcl.jsontest
 * 文件名：   User
 * 创建者：   70889
 * 创建时间： 2018/6/25 15:53
 * 描述：     TODO
 */

public class User {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id = " + id + ",name = " + name + ",address = " + address;
    }
}
