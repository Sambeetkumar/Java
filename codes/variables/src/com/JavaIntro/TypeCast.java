package com.JavaIntro;

public class TypeCast {
    public static void main(String[] args) {
        byte MinByte  = Byte.MIN_VALUE;
        float MinFloat = Float.MIN_VALUE;
        float MaxFloat = Float.MAX_VALUE;
        float MyVal = 132.2448f;
        double Num1 = 1234324.242424d;

        System.out.println(MinByte);
        System.out.println(MinFloat);
        System.out.println(MaxFloat);
        System.out.println(MyVal);
        System.out.println(Num1);

        byte MyByte = (byte)(MinByte / 2);
        float MyFloat = (MaxFloat / 2);
        System.out.println(MyByte);
        System.out.println(MyFloat);
    }
}
