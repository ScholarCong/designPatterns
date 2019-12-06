package com.designPatterns.adapter.interfaceadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 17:16
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m3() {
                System.out.println("使用了m3方法");
            }
        };
        adapter.m3();
    }

}
