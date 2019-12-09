package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 21:44
 */
public abstract class Phone {

    protected Brand brand;

    protected Phone(Brand brand){
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }

}
