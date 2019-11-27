package com.homework;

public class Primitives {

    public static void main(String[] args) {

        boolean boo1 = false;
        boolean boo2 = true;

        char typeChar1 = 65;
        char typeChar2 = 2;
        System.out.println("Arithmetic operation with primitive type - Char");
        System.out.println((int)typeChar1 + " + " + (int)typeChar2 + " = " + (typeChar1+typeChar2));
        System.out.println((int)typeChar1 + " - " + (int)typeChar2 + " = " + (char)(typeChar1-typeChar2));   // interesting result
        System.out.println((int)typeChar1 + " * " + (int)typeChar2 + " = " + (typeChar1*typeChar2));
        System.out.println((int)typeChar1 + " / " + (int)typeChar2 + " = " + (typeChar1/typeChar2));
    }
}
