package com.designPatterns.builder;

//抽象的建造者
public abstract class HouseBuilder {

    House house = new House();

    abstract void BuildBisic();
    abstract void BuildWall();
    abstract void roofed();

    public House Build(){
        return house;
    }

}
