/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg_2;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jakobtottrup
 */
public class Doubles {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        String fileName = "doubles.txt";
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file "
                    + fileName);
            System.exit(0);
        }

        while (inputStream.hasNextLine()) {
            double line = parseDouble(inputStream.nextLine());
            list.add(line);

        }
        inputStream.close();

        Collections.sort(list);
        float sum = 0;
        for (Double d : list) {
            sum += d;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Lowest number: " + list.get(0));
        System.out.println("Highest number: " + list.get(list.size() - 1));
        System.out.println("Average: " + (sum / list.size()));

    }
}
