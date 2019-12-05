package com.designPatterns.factory.factorymethod.Order;

import com.designPatterns.factory.factorymethod.pizza.BJCheesePizza;
import com.designPatterns.factory.factorymethod.pizza.LOCheesePizza;
import com.designPatterns.factory.factorymethod.pizza.LOGreekPizza;
import com.designPatterns.factory.factorymethod.pizza.Pizza;
import com.designPatterns.factory.simpleFactory.CheesePizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 14:27
 */
public class LOorderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String OrderType) {
        Pizza pizza = null;
        if(OrderType.equals("greek")){
            pizza = new LOCheesePizza();
        }else if(OrderType.equals("cheese")){
            pizza = new LOGreekPizza();
        }
        return pizza;
    }
}
