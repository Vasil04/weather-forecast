package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.*;;

public class Main {

//    public static void main(String[] args) {
//        File file = new File("weather.txt");
//        try {
//            Scanner fileReader = new Scanner(file, "windows-1251");
//            System.out.println(fileReader.nextLine());
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    // Java Program to illustrate reading from text file
// as string in Java
        public static String readFileAsString(String fileName)throws Exception
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        }

        public static void main(String[] args) throws Exception
        {
            String data = readFileAsString("weather.txt");
            String test = "";
            char current = ' ';
            for (int i = 0; i < data.length(); i++) {
                current = data.charAt(i);
                if (current == ';'){
                    break;
                }
                else {
                    test += data.charAt(i);
                }
            }
            System.out.println(test);
        }
    }
