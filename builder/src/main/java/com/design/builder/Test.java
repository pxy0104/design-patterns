package com.design.builder;


class BuildHouse implements Build {

    @Override
    public void step1() {
        System.out.println("打地基");
    }

    @Override
    public void step2() {
        System.out.println("搬砖");
    }

    @Override
    public void step3() {
        System.out.println("外围");
    }

    @Override
    public void step4() {
        System.out.println("装修");
    }

    @Override
    public void step5() {
        System.out.println("景观");
    }
}

class BuildCar implements Build {
    @Override
    public void step1() {
        System.out.println("1");
    }
    @Override
    public void step2() {
        System.out.println("2");
    }
    @Override
    public void step3() {
        System.out.println("3");
    }
    @Override
    public void step4() {
        System.out.println("4");
    }
    @Override
    public void step5() {
        System.out.println("汽车构造完成");
    }
}

class Builder {
    private final Build  b;

    public Builder(Build b) {
        this.b = b;
    }

    public void build() {
        b.step1();
        b.step2();
        b.step3();
        b.step4();
        b.step5();
    }
}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Builder b = new Builder(new BuildCar());
        b.build();
        Builder b1 = new Builder(new BuildHouse());
        b1.build();
    }
}
