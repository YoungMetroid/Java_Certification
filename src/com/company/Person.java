package com.company;

public class Person
{
    int id;
    String name;
    java.util.Date pob;
    boolean VIP;
    public static void main(String... args)
    {
        Person p1 = new Person();
        Person p2 = p1;
        int  id = p2.id;
        p1.name = args[0];

        System.out.println("P1: "+ p1.getName());
        System.out.println("P1: "+ p1.getName());

    }
    public String getName(){return name;}
}
