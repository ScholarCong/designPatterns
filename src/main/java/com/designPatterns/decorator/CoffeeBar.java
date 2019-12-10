package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 22:40
 */
public class CoffeeBar {

    public static void main(String[] args) {
        Drink order = new LonfCoffee();
        float cost = order.cost();
        System.out.println("花费："+cost);
        System.out.println(order.getDesc());

        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());


    }

}
