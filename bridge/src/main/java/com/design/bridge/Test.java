package com.design.bridge;


public class Test {
    public static void main(String[] args) {
        // 创建一个红色对象和一个蓝色对象
        IColor red = new Red();
        IColor blue = new Blue();
        // 创建一个圆形对象和一个方形对象，并分别设置它们的颜色为红色和蓝色
        IShape circle = new Circle();
        circle.setColor(red);
        IShape square = new Square();
        square.setColor(blue);

        // 调用圆形和方形的画图方法
        circle.draw();
        square.draw();

    }
}