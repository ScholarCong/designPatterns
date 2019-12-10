package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 22:34
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDesc("牛奶");
        setPrice(2.0f);
    }

}
