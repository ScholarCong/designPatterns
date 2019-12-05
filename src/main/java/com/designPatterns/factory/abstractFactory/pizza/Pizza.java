package com.designPatterns.factory.abstractFactory.pizza;

/**
 * @Author : wangcong
 * @create 2019/12/4 15:59
 */
public abstract class Pizza {

    protected  String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking...");
    }

    public void cut(){
        System.out.println(name+"cutting..");
    }

    public void box(){
        System.out.println(name+"boxing..");
    }

    public void setName(String name){
        this.name = name;
    }

}
