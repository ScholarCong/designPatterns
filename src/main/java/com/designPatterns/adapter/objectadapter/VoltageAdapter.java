package com.designPatterns.adapter.objectadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 16:41
 */
public class VoltageAdapter implements Voltage5V{

    Voltage220V voltage220V;
    //构造器
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    //进行适配操作
    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dsT = src/44;
        return dsT;
    }
}
