package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class TenDaysForward {
    
    public static void readUntilSpecialSymbol(String file) throws Exception
    {
        String fileName = "weather.txt";
        int counter = 0;

        String line = null;
        FileReader fileReader1 = null;

        fileReader1 = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader1);

        while((line = bufferedReader.readLine()) != null) {
            counter++;
            if(counter >= 9 && counter <=18)
            {
                printer(line);
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }

    private static void printer(String line) {
    }
}
