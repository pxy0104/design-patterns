package com.design.state;

/**
 * 2023/4/16
 **/

public class TVOnState implements State {
    @Override
    public void doAction(TV context) {
        System.out.println("TV is turned ON");
        context.setState(this);
    }
}
