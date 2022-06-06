package com.company;

public class Main {

    static Bird bird;
    static int a = 20;
    static int b = 30;
    public static void main(String[] args) {


        bird = new Bird("Peck");
        bird.print();

        System.out.println("Main static variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println(bird);

        Bird bird2 = new Bird("Feather");
        bird2.print();

        bird.f = 3;
        bird.d = 100;

        bird.print();
        bird2.print();


    }
}
