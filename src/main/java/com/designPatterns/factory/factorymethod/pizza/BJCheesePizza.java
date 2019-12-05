package com.designPatterns.factory.factorymethod.pizza;



/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("bj的奶酪");
        System.out.println("制作奶酪披萨准备原材料");
    }
}
