package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 21:42
 */
public class Apple implements Brand {
    @Override
    public void open() {
        System.out.println("苹果手机打开");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关闭");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
