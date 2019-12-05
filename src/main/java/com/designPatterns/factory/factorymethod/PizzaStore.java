package com.designPatterns.factory.factorymethod;

import com.designPatterns.factory.factorymethod.Order.BJorderPizza;
import com.designPatterns.factory.factorymethod.Order.LOorderPizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 14:35
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new BJorderPizza();
        new LOorderPizza();
    }

}
