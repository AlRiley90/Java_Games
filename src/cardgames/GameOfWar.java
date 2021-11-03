package cardgames;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfWar {



    public static void main(String[] args) {
        Card[] cardsArr = CardsArray.getAllCards();
//        String cardInPlay = cardsArr[Card.drawCard()].getCard();
//        System.out.println(cardInPlay);
        Card playerCard = cardsArr[Card.drawCard()];

        Card computerCard = cardsArr[Card.drawCard()];
        System.out.println("playerCard true value = " + playerCard.trueValue);
        System.out.println("playerCard value = " + playerCard.value);
        System.out.println("playerCard suit = " + playerCard.suit);


//        long cardValue = cardsArr[Card.drawCard()].cardTrueValue();
//        System.out.println(cardValue);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a game of War??");
        String userResponse = scanner.next();
        if(userResponse.equalsIgnoreCase("Yes") || userResponse.equalsIgnoreCase("Y")){
            System.out.println("Please enter your name");
            String name = scanner.next();
            Player playerName = new Player(name);
            System.out.println("Thank you " + playerName.name + ". Prepare for WAR!");
        }
    }
}
