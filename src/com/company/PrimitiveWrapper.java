package com.company;

public class PrimitiveWrapper
{

    public static void main(String... args)
    {
        int i = 100;
        int i2 = 200;
        int i3 = 300;

        float f1 = 100f;

        Integer integerObj = new Integer(i);
        Integer integerObj2 = i2;
        Integer integerObj3 = Integer.valueOf(i3);

        Integer integerObj4 = Integer.valueOf("400");


        System.out.println(integerObj);
        System.out.println(integerObj2);
        System.out.println(integerObj3);
        System.out.println(integerObj4);

        int prim = integerObj.byteValue();
        System.out.println(prim);
    }
}
