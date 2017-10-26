/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg_1;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TextFileOutputDemo {

    public static void main(String[] args) {
        String fileName = "out.txt"; //The name could be read from 
        //the keyboard.
        PrintWriter outputStream = null;
        try {
            //outputStream = new PrintWriter(fileName);
            //Opg1: new FileOutputStream(String name, Boolean append); 
            //if boolean value is true, content is appended.
            outputStream = new PrintWriter(new FileOutputStream(fileName, true));

        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file "
                    + fileName);
            System.exit(0);
        }

        System.out.println("Enter three lines of text:");
        Scanner keyboard = new Scanner(System.in);
        for (int count = 1; count <= 3; count++) {
            String line = keyboard.nextLine();
            outputStream.println(count + " " + line);
        }
        outputStream.close();
        System.out.println("Those lines were written to "
                + fileName);
    }
}
