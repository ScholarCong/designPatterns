package com.designPatterns.factory.simpleFactory;

/**
 * @Author : wangcong
 * @create 2019/12/4 17:22
 */
public class PapperPizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作Papper披萨准备原材料");
    }
}
