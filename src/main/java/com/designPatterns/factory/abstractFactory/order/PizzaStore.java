package com.designPatterns.factory.abstractFactory.order;

/**
 * @Author : wangcong
 * @create 2019/12/5 15:14
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJfactory());
    }

}
