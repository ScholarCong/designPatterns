package com.designPatterns.factory.simpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author : wangcong
 * @create 2019/12/4 16:08
 */
public class OrderPizza1 {

//    Pizza pizza = null;
//    String OrderType;
//
//    public OrderPizza(){
//        do{
//            OrderType = getType();
//            if(OrderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if(OrderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else{
//                break;
//            }
//            //输出pizza的制造过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//       }while(true);
//    }

    Pizza pizza = null;
    String OrderType = "";

    public OrderPizza1(){
        do {
            OrderType = getType();
            pizza = SimpleFactory.createPizza(OrderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }
        } while (true);
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
