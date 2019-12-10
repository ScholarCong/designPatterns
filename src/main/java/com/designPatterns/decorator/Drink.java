package com.designPatterns.decorator;

/**
 * @Author : wangcong
 * @create 2019/12/10 21:26
 */
public abstract class Drink {

    public String desc;
    private float price = 0.0f;

    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc= desc;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }

    //抽象方法
    public abstract float cost();

}
