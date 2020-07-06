package com.designPatterns.singleton.双重检查;

/**
 * @Author : wangcong
 * @create 2019/11/30 0:08
 */
public class singletonTest1 {

    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
        singleton instance1 = singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("hashcode of instance: "+instance.hashCode());
        System.out.println("hashcode of instance1: "+instance1.hashCode());
    }

}

/**
 * 双重检测，即保证了线程安全，同时也保证了效率,开发当中推荐使用
 */
class singleton{

    private singleton(){}

    //volatile保证变量可见性，当变量在发生变更时能够同步变量的值，避免空引用
    private static volatile singleton singleton;

    public static singleton getInstance(){
        if(singleton == null){
            synchronized (singleton.class){
                if(singleton == null){  //同步的是这块代码，就算多个线程都进来了效率还是很高并且线程安全
                    singleton = new singleton();
                }
            }
        }
        return singleton;
    }

}
