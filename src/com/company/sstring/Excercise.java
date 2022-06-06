package com.company.sstring;

public class Excercise
{


    public static void main(String... args )
    {
        String s1 = "Felipe";

        StringBuilder sb = new StringBuilder("Felipe Elizalde");
        System.out.println(s1.toString());
        System.out.println(sb.toString());

        System.out.println(hideWordString("1234"));
        System.out.println(hideWordString("12345"));
        System.out.println(hideWordString("123456"));
        System.out.println(hideWordString("1234567"));

        System.out.println(hideWordSB(new StringBuilder("1234")));
        System.out.println(hideWordSB(new StringBuilder("12345")));
        System.out.println(hideWordSB(new StringBuilder("123456")));
        System.out.println(hideWordSB(new StringBuilder("1234567")));


        System.out.println(fusion(
                        new String[]{"1","2","3",null,null,null,"Felipe","Elizalde"}
                ));
        System.out.println(fusion(
                new String[]{}
        ));
        System.out.println(fusion(
                new String[]{null}
        ));

    }


    public static String hideWordString(String s)
    {

        int l = s.length() -4;
        if(l < 1) return s;
        String x = "";

        for(int i = 0; i < l; i++)
        {
            x = x.concat("X");
        }

        return x + s.substring(l);
    }

    public static String hideWordSB(StringBuilder sb)
    {
        int l = sb.length() - 4;
        if( l < 1 ) return sb.toString();


        sb.replace(0,l,"X".repeat(l));

        return sb.toString();
    }

    public static String fusion(String[] words)
    {
        String s = "";
        for (String word : words) {
            if(word != null)
            s = s.concat(word);
        }
        return s;
    }
}
