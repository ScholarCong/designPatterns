package com.designPatterns.factory.simpleFactory;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:02
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨准备原材料");
    }
}
