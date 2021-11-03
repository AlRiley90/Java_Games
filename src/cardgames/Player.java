package cardgames;

import java.util.Scanner;

public class Player {
    public int gamesWon;
    public String name;

    public Player(String playerName){

        this.name = playerName;
//        System.out.println(this.name);
    }

    public String getName(){
        return this.name;
    }
}
