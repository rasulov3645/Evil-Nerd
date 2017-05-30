package com.gamzat;
import java.util.Scanner;

/**
 * Created by Гамзат on 30.05.2017.
 */
public class Bender {
    public static void main(String[] args){
        Scanner enter  = new Scanner(System.in);
        Fry PhillipFry = new Fry();

        System.out.print("Введи свое имя: ");

        // Сохраняем имя в переменную name.
        String name = enter.nextLine();

        PhillipFry.FrySay(name);
    }

}
