package com.designPatterns.factory.abstractFactory.order;

import com.designPatterns.factory.abstractFactory.pizza.BJCheesePizza;
import com.designPatterns.factory.abstractFactory.pizza.BJGreekPizza;
import com.designPatterns.factory.abstractFactory.pizza.Pizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 15:01
 */
public class BJfactory implements AbsFactory {
    @Override
    public Pizza createPizza(String OrderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(OrderType.equals("greek")){
            pizza = new BJGreekPizza();
        }else if(OrderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        return pizza;
    }
}
