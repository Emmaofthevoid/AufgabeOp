package com.company;

public class Input {
    public static void main(String[] args) {

        lightswitch(12);

    }

    public static void lightswitch(int on) {

        if (on == 0) {
            System.out.println("light on!");
        } else {
            System.out.println("light off!");
        }
    }
}
