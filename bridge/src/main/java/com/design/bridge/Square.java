package com.design.bridge;


public class Square implements IShape {
    private IColor color;

    @Override
    public void draw() {
        System.out.println("方块,");color.paint();

    }

    @Override
    public void setColor(IColor color) {
        this.color = color;
    }
}