package com.designPatterns.factory.abstractFactory.pizza;


/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class LOCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LO的奶酪");
        System.out.println("制作奶酪披萨准备原材料");
    }
}
