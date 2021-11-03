package cardgames;

import java.util.Random;

public class Card {
    public String value;
    public String suit;
    public int trueValue;

    public Card(String value, String suit, int trueValue){
        this.value = value;
        this.suit = suit;
        this.trueValue = trueValue;
    }

    public String getCard(){
        return this.value +" of "+ this.suit;
    }


    public static int drawCard(){
       int randomCard = (int) Math.floor(Math.random() * CardsArray.getAllCards().length+1);
        return randomCard;
    }

    public void assignCard(Card playerCard, Card computerCard){
        if(playerCard.trueValue > computerCard.trueValue){
            System.out.println("You won this round!");
        }else if(computerCard.trueValue > playerCard.trueValue){
            System.out.println("You lost this round, better luck in the next one!");
        }
    }

}
