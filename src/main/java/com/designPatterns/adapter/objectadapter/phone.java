package com.designPatterns.adapter.objectadapter;


/**
 * @Author : wangcong
 * @create 2019/12/6 15:59
 */
public class phone {

    //充电
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压为5v，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压大于5v,不能充电");
        }
    }

}
