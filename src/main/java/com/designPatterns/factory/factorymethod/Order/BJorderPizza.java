package com.designPatterns.factory.factorymethod.Order;

import com.designPatterns.factory.factorymethod.pizza.BJCheesePizza;
import com.designPatterns.factory.factorymethod.pizza.BJGreekPizza;
import com.designPatterns.factory.factorymethod.pizza.Pizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 14:27
 */
public class BJorderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String OrderType) {
        Pizza pizza = null;
        if(OrderType.equals("greek")){
            pizza = new BJCheesePizza();
        }else if(OrderType.equals("cheese")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
