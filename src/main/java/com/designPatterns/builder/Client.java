package com.designPatterns.builder;

public class Client {

    public static void main(String[] args) {
        comonHouse comonHouse = new comonHouse();
        HouseDirector houseDirector = new HouseDirector(comonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);
        System.out.println("-------------------");
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);
    }

}
