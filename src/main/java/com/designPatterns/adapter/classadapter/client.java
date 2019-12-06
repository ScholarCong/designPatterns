package com.designPatterns.adapter.classadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 16:05
 */
public class client {

    public static void main(String[] args) {
        System.out.println("==类适配器模式==");
        phone phone = new phone();
        phone.charging(new VoltageAdapter());
    }

}
