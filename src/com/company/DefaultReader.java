package com.company;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void readUntilSpecialSymbol(String file) throws Exception
    {
        String data = readFileAsString(file);
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
