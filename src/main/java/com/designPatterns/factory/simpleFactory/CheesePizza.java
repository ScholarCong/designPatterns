package com.designPatterns.factory.simpleFactory;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class CheesePizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨准备原材料");
    }
}
