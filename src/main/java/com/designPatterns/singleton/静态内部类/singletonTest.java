package com.designPatterns.singleton.静态内部类;

/**
 * @Author : wangcong
 * @create 2019/11/30 0:25
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
 * 静态内部类，线程安全，并且效率较好，推荐使用
 */
class singleton{

    private singleton(){};

    //静态内部类，使用了类在加载时是线程安全的原则,从而保证了实列的安全；并且在singleton加载的时候是不会加载静态内部类的，所以也实现了懒加载
    private static class singletonInstance{
        public static final singleton SINGLETON = new singleton();
    }

    public static singleton getInstance(){
        return singletonInstance.SINGLETON;
    }

}
