package com.designPatterns.factory.abstractFactory.order;

import com.designPatterns.factory.abstractFactory.pizza.Pizza;

/**
 * @Author : wangcong
 * @create 2019/12/5 15:01
 */
public interface AbsFactory {

    Pizza createPizza(String OrderType);

}
