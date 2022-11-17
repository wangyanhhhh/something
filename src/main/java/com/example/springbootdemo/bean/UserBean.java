package com.example.springbootdemo.bean;

public class UserBean {
    private int id;
    private  String name;
    private  String passward;

    public int gatID(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassward(){
        return  passward;
    }
    public void setPassward(String passward){
        this.passward=passward;
    }



}
