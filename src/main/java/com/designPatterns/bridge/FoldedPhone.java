package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 21:49
 */
public class FoldedPhone extends Phone {

    /***
     *  子类的构造方法都会默认调用父类的无参构造，如果没有无参构造则调用以有的构造
     */
    protected FoldedPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        super.open();
        System.out.println("折叠手机开机");
    }

    protected void close(){
        super.close();
        System.out.println("折叠手机关机");
    }

    protected void call(){
        super.call();
        System.out.println("折叠手机");
    }

}
