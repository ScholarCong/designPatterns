package com.designPatterns.builder;

public class comonHouse extends HouseBuilder {
    void BuildBisic() {
        super.house.setBasic("commonbasic");
        System.out.println("普通房子打地基5米");
    }

    void BuildWall() {
        super.house.setWall("commonWall");
        System.out.println("普通房子砌墙10米");
    }

    void roofed() {
        super.house.setRoofed("commonroofed");
        System.out.println("普通房子的屋顶");
    }
}
