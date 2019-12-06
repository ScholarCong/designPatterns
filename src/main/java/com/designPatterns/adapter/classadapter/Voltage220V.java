package com.designPatterns.adapter.classadapter;

/**
 * @Author : wangcong
 * @create 2019/12/6 15:42
 */
public class Voltage220V {
    //输出220v电压
    public int output220V(){
        int src = 220;
        System.out.println("电压"+src+"V");
        return src;
    }

}
