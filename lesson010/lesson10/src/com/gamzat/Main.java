package com.gamzat;

public class Main {

    public static void main(String[] args) {
        int Bender = 5;   // Какой то Робот.
        int Beer = 4;     // Пиво 4 стакана.

        // Условия  if
        if (Bender == 1) {
            System.out.println("Это всего-лишь 1");
        }
        if (Bender == 2) {
            System.out.println("Это всего-лишь 2");
        }
        if (Bender == 3) {
            System.out.println("Это всего-лишь 3");
        }
        if (Bender == 4) {
            System.out.println("Это всего-лишь 4");
        }
        if (Bender == 5) {
            System.out.println("Это всего-лишь 5");
        }

        switch (Beer) {

            case 1:
                System.out.println("После 1 кружки пива я в польном порядке!");
                break;
            case 2:
                System.out.println("После 2 кружки пива я ищу приключения!");
                break;
            case 3:
                System.out.println("После 3 кружки пива приключения ищут меня!");
                break;
            case 4:
                System.out.println("После 4 кружки пива я начинаю разбираться в политике!");
                break;
            default:
                System.out.println("В этом мире слишком мало пива!");
                break;
        }
    }
}
