
package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tomorrow extends DefaultReader {

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
            if(counter >= 5 && counter <=8)
            {
                printer(line);
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
}
