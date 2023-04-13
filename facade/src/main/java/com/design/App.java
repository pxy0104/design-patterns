package com.design;

import com.design.facade.ShapeMaker;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
