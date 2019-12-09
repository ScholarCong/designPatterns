package com.designPatterns.bridge;

/**
 * @Author : wangcong
 * @create 2019/12/9 22:45
 */
public class Client {

    public static void main(String[] args) {
        FoldedPhone Phone = new FoldedPhone(new Xiaomi());
        Phone.close();
        Phone.open();
        Phone.call();
        System.out.println("+++++++++");
        FoldedPhone phone1 = new FoldedPhone(new Apple());
        phone1.call();
        phone1.open();
        phone1.close();
    }

}
