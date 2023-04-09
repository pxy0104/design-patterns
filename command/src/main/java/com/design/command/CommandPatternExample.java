package com.design.command;

/**
 * 2023/4/9
 **/

// 命令接口
interface Command {
    void execute();
}

// 具体命令类
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

// 接收者类
class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}

// 调用者类
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// 客户端代码
public class CommandPatternExample {
    public static void main(String[] args) {
        // 创建接收者对象
        Light light = new Light();

        // 创建命令对象
        Command lightOnCommand = new LightOnCommand(light);

        // 创建调用者对象
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);

        // 按下按钮，执行命令
        remoteControl.pressButton(); // 输出 "Light is on"
    }
}