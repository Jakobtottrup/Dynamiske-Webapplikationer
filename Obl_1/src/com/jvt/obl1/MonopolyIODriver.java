/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

/**
 *
 * @author jakobtottrup
 */
public class MonopolyIODriver extends MonopolyDriver {

    private String fileName;

    public MonopolyIODriver(int noOfPlayers, String fileName) {
        //super(noOfPlayers);
        this.fileName = fileName;

    }

    @Override
    public void fillBoard() {

        /*
        1. Hent data fra filen
        2. lav switch-case der laver en breweryfield klasse ved bryggerierne osv
        3. I for-loopet laves en ny instans af den rigtige felt klasse.
        
         */
        System.out.println("Testing filereader");
        for (int i = 0; i < monopolyBoard.length; i++) {

            // monopolyBoard[i] = new "FELT TYPE KLASSE HER";
            // monopolyBoard[i] = new StreetField("yo", i, 2);
        }

        for (int i = 0; i < monopolyBoard.length; i++) {
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

        }

    }
}
