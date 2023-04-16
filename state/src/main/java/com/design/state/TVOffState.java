package com.design.state;

/**
 * 2023/4/16
 **/

public class TVOffState implements State {
    @Override
    public void doAction(TV context) {
        System.out.println("TV is turned OFF");
        context.setState(this);
    }
}