package gameplatform;

public class Rules {

    public void run(){
        System.out.println("Game Rules");
        printHangMangRules();
        System.out.println("");
        printBlackJackRules();
        System.out.println("");
        printTicTacToeRules();
    }

    private void printHangMangRules(){
        System.out.println("HangMan Rules:");
        System.out.println("1 - A Hidden Word will be randomly selected for the player to try to guess it.");
        System.out.println("2 - You Only Have six Attempts to try to find the Hidden Letter :");
        System.out.println("3 - EveryTime you get a letter Wrong the man lose a part of the Body, until it completely disappear :");

    }

    private void printBlackJackRules(){
        System.out.println("BlackJack Rules:");
        System.out.println("1 - This is card game.Each participant attempts to beat the dealer by getting a count as close to 21 as possible, without going over 21.");
        System.out.println("2 - First of all, you have $100.You can decide how much you will bet.And then Each player except the dealer receives two cards face up, and the dealer receives one card face up and one card face down.");
        System.out.println("3 - 1 to 10 cards are same number.Face cards are 11 and any other card is its same value.");
        System.out.println("4 - If you have 2 cards which of tatal are 21, it is called BlackJack. you can get money inmmidiately.and the game will start agein");
        System.out.println("5 - The player to the left goes first and must decide whether to stand (not ask for another card) or hit (ask for another card in an attempt to get closer to a count of 21, or even hit 21 exactly). Thus, a player may stand on the two cards originally dealt him, or he may ask the dealer for additional cards, one at a time, until he either decides to stand on the total (if it is 21 or under), or goes bust (if it is over 21). In the latter case, the player loses and the dealer collects the bet wagered. The dealer then turns to the next player to his left and serves him in the same manner.");
        System.out.println("6 - When the dealer has served every player, his face-down card is turned up. If the total is 17 or more, he must stand. If the total is 16 or under, he must take a card. He must continue to take cards until the total is 17.");
        System.out.println("7 - If your number is higher than the dealer’s number you get double the money you won. If the dealer and another player both have naturals, the bet of that player is a stand-off (a tie), and the player takes back his chips. ");
        System.out.println("8 - If you don’t have money,the game will be end");
    }

    private void printTicTacToeRules(){
        System.out.println(" TicTacToe Rules:");
        System.out.println("1 - Tic-tac-toe is a simple, two-player game which, if played optimally by both players, will always result in a tie. The game is also called noughts and crosses or Xs and Os.");
        System.out.println("2 - The goal of tic-tac-toe is to be the first player to get three in a row on a 3 x 3 grid, or four in a row in a 4 x 4 grid.");
        System.out.println("3 - To start, one player draws a board, creating a grid of squares, usually 3 x 3 or 4 x 4.");
        System.out.println("4 - The player who is playing X always goes first. Players alternate placing Xs and Os on the board until either one player has three in a row, horizontally, vertically, or diagonally; or all nine squares are filled.");
        System.out.println("6 - If a player is able to draw three of their Xs or three of their Os in a row, then that player wins.");
        System.out.println("7 - If all nine squares are filled and neither player has three in a row, the game is a draw.. ");
        System.out.println("8 - Gameplay is the same if you are playing on a 4 x 4 grid. The X player goes first. And, players alternate placing Xs and Os on the board until a row is completed horizontally, vertically, or diagonally, or all 16 squares are filled. If all 16 squares are filled and neither player has four in a row, the game is a draw.");


    }

}