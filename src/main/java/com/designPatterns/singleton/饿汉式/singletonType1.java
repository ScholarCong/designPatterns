package com.designPatterns.singleton.饿汉式;

/**
 * @Author : wangcong
 * @create 2019/11/29 23:05
 */
public class singletonType1 {

    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
        singleton instance1 = singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("hashcode of instance: "+instance.hashCode());
        System.out.println("hashcode of instance1: "+instance1.hashCode());
    }

}

/**
 * 饿汉式，（静态常量）
 */
class singleton{
    //提供一个私有的构造方法，避免new对象
    private singleton(){}

    //提供一个私有的实例对象
    private static final singleton singleton = new singleton();

    //提供一个静态的公共的getinstance方法
    public static singleton getInstance(){
        return singleton;
    }
}

/**
 * 饿汉式，（静态代码块）
 */
class singleton1{
    //提供一个私有的构造方法，避免new对象
    private singleton1(){}

    //提供一个私有的实例对象
    private static singleton1 singleton;

    //静态代码块
    static {
        singleton = new singleton1();
    }

    //提供一个静态的公共的getinstance方法
    public static singleton1 getInstance(){
        return singleton;
    }
}