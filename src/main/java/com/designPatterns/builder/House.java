package com.designPatterns.builder;


import lombok.Data;

@Data//---产品
public class House {
    private String basic;
    private String wall;
    private String roofed;
}
