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

    public int cardTrueValue(){

        return this.trueValue;
    }

    public static int drawCard(){
       int randomCard = (int) Math.floor(Math.random() * CardsArray.getAllCards().length+1);
        return randomCard;
    }

//    public static int assignCard(String card){
//        Card[] cardsArr =  CardsArray.getAllCards();
//        int playersCard = card.cardTrueValue();
//        return playersCard;
//    }

}
