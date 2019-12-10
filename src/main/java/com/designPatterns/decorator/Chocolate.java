package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 22:36
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f);
    }

}
