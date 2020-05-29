package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.*;;

public class Main {

    public static void main(String[] args) {
        String fileName = "weather.txt";
        try {
            DefaultReader.readUntilSpecialSymbol(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);

        options();
        String choice = "";
        while (true){
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("stop")||choice.equalsIgnoreCase("стоп")){
                break;
            }
            else if (choice.equalsIgnoreCase("1")){
                try {
                    Tomorrow.readUntilSpecialSymbol(fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if (choice.equalsIgnoreCase("2")){
                try {
                    TenDaysForward.readUntilSpecialSymbol(fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if (choice.equalsIgnoreCase("3")){
                try {
                    TenDaysBefore.readUntilSpecialSymbol(fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else {
                System.out.println("Избраната от вас опция е невалидна");
            }
            options();
        }
    }

    public static void options() {
        System.out.println("Изберете опция:");
        System.out.println("За по-подробна информация за времето утре - '1'");
        System.out.println("За прогнозата за 10 дни напред - '2'");
        System.out.println("За прогнозата за 10 дни назад - '3'");
        System.out.println("За да прекратите програмата - 'стоп' или 'stop'");
    }
}
