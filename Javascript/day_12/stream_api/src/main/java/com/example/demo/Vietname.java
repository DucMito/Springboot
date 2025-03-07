package com.example.demo;

public class Vietname implements Greeting{

    @Override
    public void satHello(String name) {
        System.out.println("Xin chao " + name);

        //C1: Sử dụng class implement Greeting
        Greeting vietname = new Vietname();
        vietname.satHello("Duc mito");

        // C2: Sử dung anomymous class
        Greeting china = new Greeting() {
            @Override
            public void satHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        china.satHello("Duc mito");

        // C3: Sử dụng lambda
        Greeting english = (n) -> System.out.println("Hello " + n);
        english.satHello("Duc");
    }
}
