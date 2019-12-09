package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 21:39
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机打开");
    }

    @Override
    public void close() {
        System.out.println("小米手机关闭");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
