package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 22:49
 */
public class UpRightPhone extends Phone{

    protected UpRightPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        super.open();
        System.out.println("直立手机打开");
    }

    protected void close(){
        super.close();
        System.out.println("直立手机关闭");
    }

    protected void call(){
        super.call();
        System.out.println("直立手机打电话");
    }
}
