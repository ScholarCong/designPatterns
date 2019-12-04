package com.designPatterns.factory.simpleFactory;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:24
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizza(new SimpleFactory());
        System.out.println("程序结束");
    }

}
