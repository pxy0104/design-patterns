package com.design.facade;

/**
 * 2023/4/13
 **/

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape  square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
