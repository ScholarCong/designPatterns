package com.designPatterns.factory.simpleFactory;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:07
 */
public class SimpleFactory {

    public Pizza createPizza(String OrderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (OrderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (OrderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(OrderType.equals("papper")){
            pizza = new PapperPizza();
            pizza.setName("papper披萨");
        }
            return pizza;

    }

    //简单工厂模式也叫做静态工厂模式


}
