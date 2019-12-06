package com.designPatterns.adapter.classadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 15:55
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    //将两者适配起来，5v适配220v
    @Override
    public int output5V() {
        int src = output220V();
        int dsT = src/44;
        return dsT;
    }
}
