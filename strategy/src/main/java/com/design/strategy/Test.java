package com.design.strategy;

public class Test {
    public static void main(String[] args) {
        Strategy planA = new PlanA();
        Context context= new Context(planA);
        context.exec();
    }
}
