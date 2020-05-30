package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DefaultReader {
//    public static String readFileAsString(String fileName)throws Exception
//    {
//        String data = "";
//        data = new String(Files.readAllBytes(Paths.get(fileName)));
//        return data;
//    }

    public static void readSpecificLines(String file) throws Exception
    {
//        File file1 = new File("weather.txt");
//        Scanner fileReader = new Scanner(file1, "utf-8");
//        String hope = fileReader.nextLine();
//        System.out.println(hope);
/////////////////////////////////////////////////////////////////////////////////
        String fileName = "weather.txt";
        int counter = 0;

        String line = null;
        FileReader fileReader1 = null;

        fileReader1 = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader1);

        while((line = bufferedReader.readLine()) != null) {
            counter++;
            if(counter <= 3)
            {
                printer(line);
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
////////////////////////////////////////////////////////////////////////////////
//        String data = readFileAsString(file);
//        String test = "";
//        char current = ' ';
//        for (int i = 0; i < data.length(); i++) {
//            current = data.charAt(i);
//            if (current == ';'){
//                break;
//            }
//            else {
//                test += data.charAt(i);
//            }
//        }
//        System.out.println(test);
    }

    public static void printer(String line) {
        char current = ' ';
        for (int i = 0; i < line.length(); i++) {
            current = line.charAt(i);
            if (current == ';'){
                System.out.println();
            }
            else {
                System.out.print(current);
            }
        }
    }
}
