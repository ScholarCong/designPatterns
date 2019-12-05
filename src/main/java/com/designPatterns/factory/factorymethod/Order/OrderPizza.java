package com.designPatterns.factory.factorymethod.Order;

import com.designPatterns.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:08
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String OrderType);

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String Ordertype = "";
        do{
            Ordertype = getType();
            pizza = createPizza(Ordertype);//抽象方法，由工厂子类实现
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入pizza类型");
            return s.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
