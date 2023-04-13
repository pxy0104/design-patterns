package com.design.facade;

/**
 * 2023/4/13
 **/

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
