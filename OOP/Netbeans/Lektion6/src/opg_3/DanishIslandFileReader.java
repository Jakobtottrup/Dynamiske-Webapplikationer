/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg_3;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author erso
 */
public class DanishIslandFileReader {

    private File inFile;
    private List<DanishIsland> islandList;

    public DanishIslandFileReader(String fName) {
        inFile = new File(fName);
    }

    private void readFile() {
        islandList = new ArrayList<DanishIsland>();
        Scanner scan = null;
        String line;
        String[] tokens;

        String name = "";
//        double circ;
//        double area;
//        int addr;
//        int adkm;

        try {
            scan = new Scanner(inFile, "UTF-8");
            while(scan.hasNextLine()){
                line = scan.nextLine();
                tokens = line.split(" ");
                islandList.add(new DanishIsland(tokens[0], parseDouble(tokens[1]), parseDouble(tokens[2]), parseInt(tokens[3]), parseInt(tokens[4])));                
            }
            // Laes filen �n linje ad gangen. Split linjen p� mellemrums tegnet.
            // Konverter de enkelte v�rdier til typerne der skal bruges i DanishIsland.
            // Opret et objekt for hver linje og tilf�j det til listen.
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ne) {
            System.err.println("NumberFormatException in " + name
                    + "\n" + ne.getMessage());
        } finally {
            scan.close();
        }
    }
    
    public List<?> getList(){
        return islandList;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        DanishIslandFileReader fr = new DanishIslandFileReader("Islands punktum.txt");
        //DanishIslandFileReader fr = new DanishIslandFileReader("Islands komma.txt");
        fr.readFile();
        
        
        System.out.println("Result:\n NAVN\t\tOMKREDS\tAREAL\tADRESSER ADRESSER PR. KM2\n " + fr.getList().toString().replace(",", "").replace("[", "").replace("]", ""));

    }


}
