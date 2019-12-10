package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 22:09
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
