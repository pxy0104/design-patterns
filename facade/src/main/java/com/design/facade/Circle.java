package com.design.facade;

/**
 * 2023/4/13
 **/

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
