package com.jvt.obl1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonopolyIODriver extends MonopolyDriver {

    private File inFile;
    private List<FieldInterface> fieldlist;

    public MonopolyIODriver(int noOfPlayers, String fileName) {
        inFile = new File(fileName);
    }

    private void readFile() {
        fieldlist = new ArrayList<FieldInterface>();
        Scanner scan = null;
        String line;
        String[] tokens;

        int boardIndex;
        String name = "";
        String type = "";
        int buy_price;
        int rent_price;

        try {
            scan = new Scanner(inFile, "UTF-8");
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                tokens = line.split("\t");

                boardIndex = Integer.parseInt(tokens[0]);
                name = tokens[1];
                type = tokens[2];
                switch (boardIndex + 1) {
// Andre felter:
                    case 1:
                    case 3:
                    case 5:
                    case 8:
                    case 11:
                    case 18:
                    case 21:
                    case 23:
                    case 34:
                    case 37:
                    case 39:
                        fieldlist.add(new OtherField(name, boardIndex));
                        break;
// Gå i spjældet:
                    case 31:
                        fieldlist.add(new GoToJailField(name, boardIndex));
                        break;
// Rederier:
                    case 6:
                    case 16:
                    case 26:
                    case 36:
                        buy_price = Integer.parseInt(tokens[3]);
                        rent_price = Integer.parseInt(tokens[4]);
                        fieldlist.add(new ShipField(name, boardIndex, buy_price, rent_price));
                        break;
//Bryggerier:
                    case 13:
                    case 29:
                        buy_price = Integer.parseInt(tokens[3]);
                        rent_price = 2;
                        fieldlist.add(new BreweryField(name, boardIndex, buy_price, rent_price));
                        break;
// Gader:
                    default:
                        buy_price = Integer.parseInt(tokens[3]);
                        rent_price = Integer.parseInt(tokens[4]);
                        fieldlist.add(new StreetField(name, boardIndex, buy_price, rent_price));
                }
                
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ne) {
            System.err.println("NumberFormatException in " + name
                    + "\n" + ne.getMessage());
        } finally {
            scan.close();
        }
        
    }

    @Override
    public void fillBoard() {
        readFile();
        for (int i = 0; i < monopolyBoard.length; i++) {
            monopolyBoard[i] = fieldlist.get(i);
        }
    }
}
