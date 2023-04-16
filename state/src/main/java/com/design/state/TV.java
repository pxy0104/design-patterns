package com.design.state;

/**
 * 2023/4/16
 **/

public class TV {
    private State state;

    public TV(){
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
