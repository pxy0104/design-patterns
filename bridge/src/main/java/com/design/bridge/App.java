package com.design.bridge;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Computer c = new Laptop(new Lenovo());
        c.sale();
        Computer c2 = new Desktop(new Dell());
        c2.sale();
    }
}
