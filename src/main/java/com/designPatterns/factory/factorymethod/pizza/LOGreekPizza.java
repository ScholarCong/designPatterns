package com.designPatterns.factory.factorymethod.pizza;


/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class LOGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LO的希腊");
        System.out.println("制作希腊披萨准备原材料");
    }
}
