package com.company;

public class Bird {
    static  float f = 1;
    static  double d = 2;
    static  boolean b = true;
    String birdName;
    Bird birdception;
    public Bird(String birdName)
    {
       this.birdName = birdName;
    }
    public void fly()
    {
        System.out.println("Flying");
    }

    public void print()
    {
        System.out.println(birdName);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
    }
}
