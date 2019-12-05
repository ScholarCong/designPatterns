package com.designPatterns.factory.factorymethod.pizza;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("bj的希腊");
        System.out.println("制作希腊披萨准备原材料");
    }
}
