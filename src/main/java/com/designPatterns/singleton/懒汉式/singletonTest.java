package com.designPatterns.singleton.懒汉式;

/**
 * @Author : wangcong
 * @create 2019/11/29 23:45
 */
public class singletonTest {

    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
        singleton instance1 = singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("hashcode of instance: "+instance.hashCode());
        System.out.println("hashcode of instance1: "+instance1.hashCode());
    }

}

/**
 * 懒汉式，线程不安全，实际开发中不使用
 */
class singleton{

    //私有的构造器
    private singleton(){}

    private static singleton singleton;
    
    //在调用getInstance方法的时候才会创建实列
    public static singleton getInstance(){
        if (singleton == null){
            singleton = new singleton();
        }
        return singleton;
    }

}

/**
 * 懒汉式，线程安全，但是效率低下，实际开发中不使用
 */
class singleton1{

    //私有的构造器
    private singleton1(){}

    private static singleton1 singleton;

    //在调用getInstance方法的时候才会创建实列,加上同步锁
    public static synchronized singleton1 getInstance(){
        if (singleton == null){
            singleton = new singleton1();
        }
        return singleton;
    }

}
