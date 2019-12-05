package com.designPatterns.factory.abstractFactory.order;

import com.designPatterns.factory.abstractFactory.pizza.Pizza;
import jdk.nashorn.internal.objects.annotations.Where;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : wangcong
 * @create 2019/12/5 15:09
 */
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String OrderType = "";
        this.factory = factory;
        do{
            OrderType = getType();
            pizza = factory.createPizza(OrderType);
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
