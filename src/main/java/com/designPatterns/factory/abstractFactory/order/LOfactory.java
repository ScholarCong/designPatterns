package com.designPatterns.factory.abstractFactory.order;

import com.designPatterns.factory.abstractFactory.pizza.LOCheesePizza;
import com.designPatterns.factory.abstractFactory.pizza.LOGreekPizza;
import com.designPatterns.factory.abstractFactory.pizza.Pizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 15:04
 */
public class LOfactory  implements AbsFactory {
    @Override
    public Pizza createPizza(String OrderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(OrderType.equals("greek")){
            pizza = new LOGreekPizza();
        }else if(OrderType.equals("cheese")){
            pizza = new LOCheesePizza();
        }
        return pizza;
    }
}
