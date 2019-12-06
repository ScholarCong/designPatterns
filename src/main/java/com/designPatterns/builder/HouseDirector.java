package com.designPatterns.builder;

//指挥者
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造方法传入
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //setter方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //如何处理建房的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.BuildBisic();
        houseBuilder.BuildWall();
        houseBuilder.roofed();
        return houseBuilder.Build();
    }

}
