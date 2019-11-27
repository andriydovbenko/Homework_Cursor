package com.homework;

public class Primitives {

    public static void main(String[] args) {

        boolean typeBoolean = false;
        byte typeByte = 0;
        short typeShort = 0;
        int typeInt = 0;
        long typeLong = 0L;
        float typeFloat = 0.0f;
        double typeDouble = 0.0d;

        char typeChar1 = 65;
        char typeChar2 = 2;
        System.out.println("Arithmetic operation with primitive type - Char");
        System.out.println((int)typeChar1 + " + " + (int)typeChar2 + " = " + (typeChar1+typeChar2));
        System.out.println((int)typeChar1 + " - " + (int)typeChar2 + " = " + (char)(typeChar1-typeChar2));   // interesting result
        System.out.println((int)typeChar1 + " * " + (int)typeChar2 + " = " + (typeChar1*typeChar2));
        System.out.println((int)typeChar1 + " / " + (int)typeChar2 + " = " + (typeChar1/typeChar2));
    }
}
