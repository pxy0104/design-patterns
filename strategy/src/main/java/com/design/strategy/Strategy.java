package com.design.strategy;


interface Strategy{
    void content();
}

class PlanA implements Strategy {

    @Override
    public void content() {
        System.out.println("A策略:今天早点到教室！");
    }
}

class PlanB implements Strategy {
    @Override
    public void content() {
        System.out.println("B策略:今天不去教室！");
    }
}
class PlanC implements Strategy {
    @Override
    public void content() {
        System.out.println("B策略:今天在宿舍睡觉吧！");
    }
}
//上下文
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void exec(){
        strategy.content();
    }
}