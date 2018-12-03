package gameplatform;

import java.util.ArrayList;
import java.util.Scanner;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class BlackJack {

    private class Player{
        int points;
        int type;

        public Player(int type){
            this.type = type;
        }
        @Override
        public String toString() {
                if (type == 0){
                    return "Dealer have " + points + " points";
                }else {
                    return "You have " + points + " points";
                }
            }
        public int getPoints() {
            return points;
        }

        public void setPoints(int points){
            this.points = points;
        }
    };

    private Deck deckOfCards = new Deck();

    private Player player;

    private Player dealer;

    private int money = 100;

    private int bet = 0;

    private boolean blackjackrunning = true;

    private ArrayList<Card> dealerCards = new ArrayList<>();

    private ArrayList<Card> playerCards = new ArrayList<>();


    public void run(){

        // System.out.println( ansi().eraseScreen());
        // System.out.println(ansi().fg(BLUE).a("▀█████████▄   ▄█          ▄████████  ▄████████    ▄█   ▄█▄         "));
        // System.out.println(ansi().fg(BLUE).a("  ███    ███ ███         ███    ███ ███    ███   ███ ▄███▀ "));
        // System.out.println(ansi().fg(BLUE).a("  ███    ███ ███         ███    ███ ███    █▀    ███▐██▀   "));
        // System.out.println(ansi().fg(BLUE).a(" ▄███▄▄▄██▀  ███         ███    ███ ███         ▄█████▀    "));
        // System.out.println(ansi().fg(BLUE).a("▀▀███▀▀▀██▄  ███       ▀███████████ ███        ▀▀█████▄    "));
        // System.out.println(ansi().fg(BLUE).a("  ███    ██▄ ███         ███    ███ ███    █▄    ███▐██▄   "));
        // System.out.println(ansi().fg(CYAN).a("  ███    ███ ███▌    ▄   ███    ███ ███    ███   ███ ▀███▄ "));
        // System.out.println(ansi().fg(CYAN).a("▄█████████▀  █████▄▄██   ███    █▀  ████████▀    ███   ▀█▀ "));
        // System.out.println(ansi().fg(CYAN).a("             ▀                                   ▀         "));
        // System.out.println(ansi().fg(CYAN).a("     ▄█    ▄████████  ▄████████    ▄█   ▄█▄                "));
        // System.out.println(ansi().fg(CYAN).a("    ███   ███    ███ ███    ███   ███ ▄███▀                "));
        // System.out.println(ansi().fg(CYAN).a("    ███   ███    ███ ███    █▀    ███▐██▀                  "));
        // System.out.println(ansi().fg(MAGENTA).a("    ███   ███    ███ ███         ▄█████▀                   "));
        // System.out.println(ansi().fg(MAGENTA).a("    ███ ▀███████████ ███        ▀▀█████▄                   "));
        // System.out.println(ansi().fg(MAGENTA).a("    ███   ███    ███ ███    █▄    ███▐██▄                  "));
        // System.out.println(ansi().fg(MAGENTA).a("    ███   ███    ███ ███    ███   ███ ▀███▄                "));
        // System.out.println(ansi().fg(MAGENTA).a("█▄ ▄███   ███    █▀  ████████▀    ███   ▀█▀                "));
        // System.out.println(ansi().fg(MAGENTA).a("▀▀▀▀▀▀                            ▀           "));
        // System.out.println(ansi().fg(CYAN).a(""));
        // System.out.println(ansi().fg(CYAN).a(""));
        // System.out.println(ansi().fg(BLUE).a("                                                  ██████╗  ██╗"));
        // System.out.println(ansi().fg(BLUE).a("                                                  ╚════██╗███║"));
        // System.out.println(ansi().fg(CYAN).a("                                                   █████╔╝╚██║"));
        // System.out.println(ansi().fg(CYAN).a("                                                  ██╔═══╝  ██║"));
        // System.out.println(ansi().fg(MAGENTA).a("                                                  ███████╗ ██║"));
        // System.out.println(ansi().fg(MAGENTA).a("                                                  ╚══════╝ ╚═╝"));
        // System.out.println(ansi().reset());

        System.out.println("Welcome to Black Jack (21)");
        Scanner input = new Scanner(System.in);
        System.out.print("Please tell me inform your name: ");
        String name = input.nextLine();

        while(blackjackrunning) {
            if (money == 0){
                System.out.println("Sorry "+name+" you have no more money to bet!!");
                endgame();
                // break;
            }

            System.out.println("Thank you " + name + ", you have $"+money+",00. To Bet!!!");

            // Making the Bet
            do{
                System.out.println("");
                System.out.println("\u25CF Please make a valid bet for the game to Start!");
                System.out.println("\u25CF If you bet 0 (Zero) The game will end!");
                System.out.println("\u25CF A valid bet, is a non-negative number and bust be less than $"+money+",00");
                System.out.println("");
                System.out.print("How much do you want to bet:  ");
                bet = input.nextInt();
            }while(bet > money || bet < 0);

            // if the bet is 0 the game will finish.
            if (bet == 0 ) {
                System.out.println("Thank you "+name+" you have finished with $" + money + ",00");
                endgame();
            } else {
                System.out.println("");
                System.out.println("The game Begins, you have bet $" + bet + ",00");
                System.out.println("");
                // withdraw after the bet.
                money = money - bet;

                // initialize the decks and player and dealer cards
                deckOfCards = new Deck();
                dealerCards = new ArrayList<>();
                playerCards = new ArrayList<>();
                playerCards.add(deckOfCards.removeCard());
                dealerCards.add(deckOfCards.removeCard());
                playerCards.add(deckOfCards.removeCard());

                player = new Player(1);
                dealer = new Player(0);

                // first time counting the points
                countPoints(0);
                countPoints(1);

                //print dealer cards
                System.out.println("Dealer Cards");
                printCards(dealerCards);
                System.out.println(dealer.toString());

                //print player cards
                System.out.println("Player Cards");
                printCards(playerCards);
                System.out.println(player.toString());



                int continuePlay = checkPoints(1);
                if (continuePlay == 1) {
                    money = money + (2 * bet);
                } else {

                    // the interaction between dealer and player loop
                    while (continuePlay == 0) {
                        System.out.println("");
                        System.out.println(name + ", Please would you like to: \n 1-Stand \n 2- Hit");

                        // Check if the player hits by pressing 2;
                        while (input.nextInt() == 2) {

                            // get a card to the player since the player hit
                            playerCards.add(deckOfCards.removeCard());
                            countPoints(1);

                            //print dealer cards
                            System.out.println("Dealer Cards");
                            printCards(dealerCards);
                            System.out.println(dealer.toString());

                            //print player cards
                            System.out.println("Player Cards");
                            printCards(playerCards);
                            System.out.println(player.toString());

                            // with checkpoints, check if the player reached more than 21 points.
                            continuePlay = checkPoints(1);
                            if (continuePlay == 1) {
                                money = money + (2 * bet);
                                break;
                            }
                            if (continuePlay != 0)
                                break;
                            System.out.println(name + ", Please would you like to: \n 1-Stand \n 2- Hit");
                        }
                        if (continuePlay != 0)
                            break;
                        System.out.println("You Stand with " + player.getPoints() + " points");
                        System.out.println("");
                        System.out.println("Dealer's Turn");
                        System.out.println("");
                        while (dealer.getPoints() < player.getPoints()) {
                            dealerCards.add(deckOfCards.removeCard());
                            countPoints(0);
                            continuePlay = checkPoints(0);
                            //print dealer cards
                            System.out.println("Dealer Cards");
                            printCards(dealerCards);
                            System.out.println(dealer.toString());
                            //print player cards
                            System.out.println("Player Cards");
                            printCards(playerCards);
                            System.out.println(player.toString());
                        }

                        if (dealer.getPoints() == player.getPoints()) {
                            System.out.println("");
                            System.out.println("It is a Tie!!!");
                            System.out.println("");
                            money = money + bet;
                            continuePlay = 3;
                        } else if ((dealer.getPoints() > player.getPoints()) && (dealer.getPoints() <= 21)) {
                            System.out.println("");
                            System.out.println("Dealer Wins!!!");
                            System.out.println("");
                            continuePlay = 3;
                        } else {
                            System.out.println("");
                            System.out.println("Dealer Lose!!!");
                            System.out.println("");
                            continuePlay = 3;
                            money = money + (2 * bet);
                        }
                    }
                }
            }
        }
    }

    // method to finish the game
    private void endgame(){
        System.out.println("Thank you for playing Blackjack");
        blackjackrunning = false;
    }


// method to print cards
    private void printCards(ArrayList<Card> cards){
        String s1="";
        String s2="";
        String s3="";
        String s4="";
        for (Card c: cards) {
            s1 = s1 + " |----| ";
            s4 = s4 + " |----| ";
            if (c.getValue() == 10){
                s2 = s2 + " | " + c.getValue() + " | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }else if (c.getValue()==11){
                s2 = s2 + " | " + 'J' + "  | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }else if (c.getValue()==12){
                s2 = s2 + " | " + 'Q' + "  | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }else if (c.getValue()==13){
                s2 = s2 + " | " + 'K' + "  | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }else if (c.getValue()==1){
                s2 = s2 + " | " + 'A'+ "  | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }else{
                s2 = s2 + " | " + c.getValue() + "  | ";
                s3 = s3 + " | " + c.getSuit() + "  | ";
            }
        }

        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println();
    }


    // if the type parameter is == 0 is the dealer, if its 1 is the player.
    private void countPoints(int type){
        int sum = 0;
        int actualvalue = 10;
        if (type == 0){
            for (Card c: dealerCards) {
                    if (c.getValue() == 11 || c.getValue() == 12 || c.getValue() == 13) {
                        sum = sum + actualvalue;
                    }
                    else if (c.getValue() == 1){
                        sum = sum + 11;
                    }
                    else{
                        sum = sum + c.getValue();
                    }
            }
            dealer.setPoints(sum);
        }else{
            for (Card c: playerCards) {
                if (c.getValue() == 11 || c.getValue() == 12 || c.getValue() == 13) {
                    sum = sum + actualvalue;
                }
                else if (c.getValue() == 1){
                    sum = sum + 11;
                }
                else{
                    sum = sum + c.getValue();
                }
            }
            player.setPoints(sum);
        }

    }

    // type 0 == dealer, type 1 == player
    private int checkPoints(int type){
        if(type == 0){
                if (dealer.getPoints() == 21) {
                    System.out.println("Dealer got a 21 ");
                    return 1;
                } else if (dealer.getPoints() > 21) {
                    System.out.println("Dealer lose with more than 21 ");
                    return 2;
                } else {
                    System.out.println("Dealer Continues to Play! ");
                    return 0;
                }
        }else{
            if (player.getPoints() == 21){
                System.out.println("Congratulations you have a Black Jack ");
                return 1;
            }else if (player.getPoints() > 21){
                System.out.println("You Lose, you have more than 21 ");
                return 2;
            }else{
                System.out.println("You can continue to Play! ");
                return 0;
            }
        }
    }
}
