package com.designPatterns.singleton.枚举;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @Author : wangcong
 * @create 2019/11/30 15:52
 */
public class singletonTest {

    public static void main(String[] args) {
        singleton instance = singleton.INSTANCE;
        singleton instance1 = singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 枚举类型实现单例，推荐使用
 */
enum singleton{

    INSTANCE(1,"ds");

    int code;
    String msg;

    singleton(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public void say(){
        System.out.println("ok");
    }

}
