package com.gamzat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Bender = new Scanner(System.in);
        double FirstNumber;
        double SecondNumber;
        double Result;
        //double FirstNumber, SecondNumber, Result


        System.out.println("Введите первое число: ");
        FirstNumber = Bender.nextDouble();
        System.out.println("Введите второе число: ");
        SecondNumber = Bender.nextDouble();

        Result = FirstNumber + SecondNumber;
        System.out.println("Сумма равна: " + Result);

    }
}
