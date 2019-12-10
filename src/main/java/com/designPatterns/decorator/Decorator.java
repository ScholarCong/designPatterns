package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 22:25
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDesc() {
        return super.desc + "" +super.getPrice() + "&&" + obj.getDesc();
    }
}
