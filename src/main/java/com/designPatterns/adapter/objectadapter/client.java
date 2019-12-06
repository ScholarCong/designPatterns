package com.designPatterns.adapter.objectadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 16:47
 */
public class client {

    public static void main(String[] args) {
        System.out.println("==对象适配器==");
        phone phone = new phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
