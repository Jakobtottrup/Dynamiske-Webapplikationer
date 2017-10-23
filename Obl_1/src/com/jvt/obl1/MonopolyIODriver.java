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

                //fieldlist.add(new ShipField(name, boardIndex, 200));
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
                        //monopolyBoard[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i], i + 1, 0);
                        break;
// Gå i spjældet:
                    case 31:
                        fieldlist.add(new GoToJailField(name, boardIndex));
                        //monopolyBoard[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i], i + 1);
                        break;
// Rederier:
                    case 6:
                    case 16:
                    case 26:
                    case 36:
                        buy_price = Integer.parseInt(tokens[3]);
                        rent_price = Integer.parseInt(tokens[4]);
                        //rent_price = 2;
                        fieldlist.add(new ShipField(name + "\tPris: " + buy_price + "\tLeje: " + rent_price, boardIndex, buy_price, rent_price));
                        //monopolyBoard[i] = new ShipField(MonopolyConstants.FIELD_NAMES[i], i + 1, 200);
                        break;
//Bryggerier:
                    case 13:
                    case 29:
                        buy_price = Integer.parseInt(tokens[3]);
                        //rent_price = Integer.parseInt(tokens[4]);
                        rent_price = 2;
                        fieldlist.add(new BreweryField(name + "\t \033[31mPris:\033[32m" + buy_price + "\tLeje: " + rent_price, boardIndex, buy_price, rent_price));
                        //monopolyBoard[i] = new BreweryField(MonopolyConstants.FIELD_NAMES[i], i + 1, 150);
                        break;
// Gader:
                    default:
                        buy_price = Integer.parseInt(tokens[3]);
                        rent_price = Integer.parseInt(tokens[4]);
                        //rent_price = 2;
                        fieldlist.add(new StreetField(name + "\tPris: " + buy_price + "\tLeje: " + rent_price, boardIndex, buy_price, rent_price));
                        //monopolyBoard[i] = new StreetField(MonopolyConstants.FIELD_NAMES[i], i + 1, 10 * i);
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
        /*
        1. Hent data fra filen
        2. lav switch-case der laver en breweryfield klasse ved bryggerierne osv
        3. I for-loopet laves en ny instans af den rigtige felt klasse.
        
         */
        System.out.println("Testing filereader");

        for (int i = 0; i < monopolyBoard.length; i++) {
            monopolyBoard[i] = fieldlist.get(i);
        }

        /*for (int i = 0; i < monopolyBoard.length; i++) {
            switch (i) {
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
                    monopolyBoard[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i], i + 1, 0);
                    break;
// Gå i spjældet:
                case 31:
                    monopolyBoard[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i], i + 1);
                    break;
// Rederier:
                case 6:
                case 16:
                case 26:
                case 36:
                    monopolyBoard[i] = new ShipField(MonopolyConstants.FIELD_NAMES[i], i + 1, 200);
                    break;
//Bryggerier:
                case 13:
                case 29:
                    monopolyBoard[i] = new BreweryField(MonopolyConstants.FIELD_NAMES[i], i + 1, 150);
                    break;
// Gader:
                default:
                    monopolyBoard[i] = new StreetField(MonopolyConstants.FIELD_NAMES[i], i + 1, 10 * i);
            }

        }*/
    }
}
