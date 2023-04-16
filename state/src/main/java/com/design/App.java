package com.design;

import com.design.state.TV;
import com.design.state.TVOffState;
import com.design.state.TVOnState;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TV tv = new TV();
        TVOffState tvOffState = new TVOffState();
        tvOffState.doAction(tv);
        TVOnState tvOnState = new TVOnState();
        tvOnState.doAction(tv);
        System.out.println(tv.getState());
    }
}
