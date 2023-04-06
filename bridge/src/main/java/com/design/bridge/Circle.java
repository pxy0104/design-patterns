package com.design.bridge;



public class Circle implements IShape{
    private IColor color;
    @Override
    public void draw() {
        color.paint();
    }

    @Override
    public void setColor(IColor color) {
        this.color = color;
    }
}
