package br.dio.bootcamp.casting;

public class Casting {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //downcasting -> short para byte, ocasionando perda de informacao

        long l1;
        int i1 = 10;
        l1 = i1; // upcasting -> de inteiro para long

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; //downcasting -> long para inteiro, ocasionando perda de informacao

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //downcasting -> long para inteiro, não houve perda

        double d1;
        float f1 = 10.5f;
        d1 = f1; //upcasting float promovido para double

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; //downcasting sem perda de informacao
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; //downcasting com perda de informacao

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; //downcasting com perda dos valores fracionados

        System.out.println("b1: " + b1);

        System.out.println("l1: " + l1);

        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);

        System.out.println("d1: " + d1);

        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);

        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);

    }
}
