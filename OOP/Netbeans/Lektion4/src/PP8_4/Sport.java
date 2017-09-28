/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP8_4;

/**
 *
 * @author jakobtottrup
 */
public class Sport {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    protected int duration;
    protected int numPlayers;
    protected boolean isBall;

    @Override
    public String toString() {
        return this.name + ", duration=" + duration + ", numPlayers=" + numPlayers + ", isBall=" + isBall;
    }

   

    public Sport(String name, int duration, int numPlayers, boolean isBall) {
        this.name = name;
        this.duration = duration;
        this.numPlayers = numPlayers;
        this.isBall = isBall;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public boolean isIsBall() {
        return isBall;
    }

    public void setIsBall(boolean isBall) {
        this.isBall = isBall;
    }
    
}

//    String name;
//    int duration;
//
//    boolean isBall;
//    int ballSize;
//
//    boolean isTeam;
//    int players;
//
////    public Sport(String name, int duration, boolean isBall, int ballSize, boolean isTeam, int players) {
////        this.name = name;
////        this.duration = duration;
////        this.isBall = isBall;
////        this.ballSize = ballSize;
////        this.isTeam = isTeam;
////        this.players = players;
////    }
//    public String Name() {
//        return name;
//    }
//
//    public int Duration() {
//        return duration;
//    }
//
//    public boolean IsBall() {
//        return isBall;
//    }
//
//    public int BallSize() {
//        return ballSize;
//    }
//
//    public boolean IsTeam() {
//        return isTeam;
//    }
//
//    public int Players() {
//        return players;
//    }
//
//    @Override
//    public String toString() {
//        return "Sport{" + "name=" + name + ", duration=" + duration + ", isBall=" + isBall + ", ballSize=" + ballSize + ", isTeam=" + isTeam + ", players=" + players + '}';
//    }

