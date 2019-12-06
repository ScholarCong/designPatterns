package com.designPatterns.builder;

public class HighBuilding extends HouseBuilder {
    
    void BuildBisic() {
        super.house.setBasic("Highhousebasic");
        System.out.println("高楼打地基5米");
    }

    void BuildWall() {
        super.house.setWall("HighhouseWall");
        System.out.println("高楼砌墙10米");
    }

    void roofed() {
        super.house.setRoofed("Highhouseroofed");
        System.out.println("高楼的屋顶");
    }
}
