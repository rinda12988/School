package gameplatform;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private Scanner input = new Scanner(System.in);


    private Integer[] positions = {1,2,3,4,5,6,7,8,9};

    private HashSet<Integer> positionsAvailable = new HashSet<Integer>(Arrays.asList(positions));

    boolean tictactoerunning = true;

    public void run(){
        // System.out.println( ansi().eraseScreen());
        // System.out.println(ansi().fg(YELLOW).a(" ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄                               ▄▄▄▄▄▄▄▄▄▄▄ "));
        // System.out.println(ansi().fg(YELLOW).a("▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌                             ▐░░░░░░░░░░░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌                             ▐░█▀▀▀▀▀▀▀█░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌▐░▌ ▐░▌▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌                             ▐░▌       ▐░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌                             ▐░▌       ▐░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌                             ▐░▌       ▐░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌                             ▐░▌       ▐░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌       ▐░▌▐░▌       ▐░▌▐░▌     ▐░▌  ▐░▌       ▐░▌                             ▐░▌       ▐░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌       ▐░▌▐░▌       ▐░▌▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌                             ▐░█▄▄▄▄▄▄▄█░▌"));
        // System.out.println(ansi().fg(YELLOW).a("▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌                             ▐░░░░░░░░░░░▌"));
        // System.out.println(ansi().fg(YELLOW).a(" ▀         ▀  ▀         ▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀                               ▀▀▀▀▀▀▀▀▀▀▀ "));
        // System.out.println(ansi().fg(CYAN).a(" ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄                   ▄       ▄  "));
        // System.out.println(ansi().fg(CYAN).a("▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌                 ▐░▌     ▐░▌ "));
        // System.out.println(ansi().fg(CYAN).a("▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌                  ▐░▌   ▐░▌  "));
        // System.out.println(ansi().fg(CYAN).a("▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌       ▐░▌                   ▐░▌ ▐░▌   "));
        // System.out.println(ansi().fg(CYAN).a("▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌                    ▐░▐░▌    "));
        // System.out.println(ansi().fg(CYAN).a("▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌                     ▐░▌     "));
        // System.out.println(ansi().fg(CYAN).a("▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░▌      ▀▀▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌                    ▐░▌░▌    "));
        // System.out.println(ansi().fg(CYAN).a("▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌               ▐░▌▐░▌       ▐░▌                   ▐░▌ ▐░▌   "));
        // System.out.println(ansi().fg(CYAN).a("▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌     ▐░▌      ▄▄▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌                  ▐░▌   ▐░▌  "));
        // System.out.println(ansi().fg(CYAN).a("▐░░░░░░░░░░▌ ▐░▌       ▐░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌                 ▐░▌     ▐░▌ "));
        // System.out.println(ansi().fg(CYAN).a(" ▀▀▀▀▀▀▀▀▀▀   ▀         ▀       ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀                   ▀       ▀  "));
        // System.out.println(ansi().reset());

        while(tictactoerunning) {
            board[0][0] = '1';
            board[0][1] = '2';
            board[0][2] = '3';
            board[1][0] = '4';
            board[1][1] = '5';
            board[1][2] = '6';
            board[2][0] = '7';
            board[2][1] = '8';
            board[2][2] = '9';
            positionsAvailable = new HashSet<Integer>(Arrays.asList(positions));
            System.out.println();
            System.out.print("Would You like to play TicTacToe against the machine? \n 1 - Yes \n 2 - No \n 3 - To Exit the game\n");
            String playerOrMachine = input.next();
            if (playerOrMachine.equals("3") || playerOrMachine.equals("n")  || playerOrMachine.equals("e") || playerOrMachine.equals("Exit")){
                endgame();
            }else {
                char whoPlayFirst;
                boolean playfirst;
                if (playerOrMachine.equals("1") || playerOrMachine.equals("y") || playerOrMachine.equals("Y") || playerOrMachine.equals("Yes") || playerOrMachine.equals("yes"))  {
                    do{
                        System.out.println("Who should go first? You (X) or the Machine (O) ?");
                        whoPlayFirst = input.next().charAt(0);

                        if (whoPlayFirst == 'O')
                            playfirst = false;
                        else if (whoPlayFirst == 'X')
                            playfirst = false;
                        else
                            playfirst = true;
                    }while(playfirst);

                } else {
                    do{
                        System.out.println("Who should go first? Player 1 (X) or Player2 (O) ");
                        whoPlayFirst = input.next().charAt(0);
                        if (whoPlayFirst == 'O')
                            playfirst = false;
                        else if (whoPlayFirst == 'X')
                            playfirst = false;
                        else
                            playfirst = true;
                     }while(playfirst);
                }


                if (playerOrMachine.equals("1") || playerOrMachine.equals("y") || playerOrMachine.equals("Y") || playerOrMachine.equals("Yes") || playerOrMachine.equals("yes")){
                    playAgainstMachine(whoPlayFirst);
                }else
                    playVsPlayer(whoPlayFirst);

            }
        }
    }

    public void endgame(){
        System.out.println("Thank you for playing TicTacToe");
        tictactoerunning = false;
    }

    public void printBoard(){
        System.out.println("");
        System.out.println(" " + board[0][0]+  " | "+ board[0][1] + " | "+  board[0][2] +" ");
        System.out.println("---|---|---");
        System.out.println(" " + board[1][0]+  " | "+ board[1][1] + " | "+  board[1][2] +" ");
        System.out.println("---|---|---");
        System.out.println(" " + board[2][0]+  " | "+ board[2][1] + " | "+  board[2][2] +" ");
        System.out.println("");
    }


    public boolean checkWinnerX(){
        boolean winner =(checkColX() || checkRowsX() || checkDiagX());
        return winner;
    }

    public boolean checkWinnerO(){
        boolean winner =(checkColO() || checkRowsO() || checkDiagO());
        return winner;
    }

    public boolean checkRowsX(){
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
            return true;
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
            return true;
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
            return true;
        else
            return false;
    }

    public boolean checkRowsO(){
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
            return true;
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
            return true;
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
            return true;
        else
            return false;
    }

    public boolean checkDiagX(){
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
            return true;
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
            return true;
        else
            return false;

    }

    public boolean checkDiagO(){
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
            return true;
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
            return true;
        else
            return false;
    }

    public boolean checkColX(){
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
            return true;
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
            return true;
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
            return true;
        else
            return false;

    }

    public boolean checkColO(){
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
            return true;
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
            return true;
        if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
            return true;
        else
            return false;

    }

    public boolean checkTie(){
        return positionsAvailable.isEmpty();
    }

    public boolean checkValidPosition(int pos){
        return positionsAvailable.contains(pos);
    }

    public void playAtPosition(int pos,char c){
        switch (pos){
            case 1:
                board[0][0] = c;
                break;
            case 2:
                board[0][1] = c;
                break;
            case 3:
                board[0][2] = c;
                break;
            case 4:
                board[1][0] = c;
                break;
            case 5:
                board[1][1] = c;
                break;
            case 6:
                board[1][2] = c;
                break;
            case 7:
                board[2][0] = c;
                break;
            case 8:
                board[2][1] = c;
                break;
            case 9:
                board[2][2] = c;
                break;
        }
    }

    public void playAgainstMachine(char whoPlayfirst){
        while (!(checkWinnerX() || checkWinnerO())) {

            if (checkTie()){
                System.out.println("It is a Tie nobody Wins the Game!!");
                break;
            }
            if (whoPlayfirst == 'O') {
                playRandom();
                printBoard();
                if(checkWinnerO()) {
                    System.out.println("You Have Lost The Game");
                    break;
                }
                if (checkTie()){
                    System.out.println("It is a Tie nobody Wins the Game!!");
                    break;
                }

                int pos = -1;
                do{
                    System.out.println("Please inform a valid  Position to play");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'X');
                positionsAvailable.remove(pos);

                printBoard();
                if(checkWinnerX()) {
                    System.out.println("You Won The Game");
                    break;
                }
            } else {
                printBoard();
                int pos = -1;
                do{
                    System.out.println("Please inform a valid  Position to play");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'X');
                positionsAvailable.remove(pos);
                playRandom();
                if(checkWinnerX()) {
                    System.out.println("You Won The Game");
                    break;
                }
                if(checkWinnerO()) {
                    System.out.println("You Have Lost The Game");
                    break;
                }
            }
        }

    }

    public void playVsPlayer(char whoPlayfirst){
        while (!(checkWinnerX() || checkWinnerO())) {
            if (checkTie()){
                System.out.println("It is a Tie nobody Wins the Game!!");
                break;
            }
            if (whoPlayfirst == 'O') {
                // O Turn
                printBoard();

                int pos = -1;
                do{
                    System.out.println("Please Player(O) inform a Valid Position to play!");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'O');
                positionsAvailable.remove(pos);
                if(checkWinnerO()) {
                    System.out.println("Player (O) Won The Game");
                    break;
                }

                if (checkTie()){
                    System.out.println("It is a Tie nobody Wins the Game!!");
                    break;
                }
                // X Turn
                do{
                    System.out.println("Please Player(X) inform a Valid Position to play!");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'X');
                positionsAvailable.remove(pos);
                printBoard();
                if(checkWinnerX()) {
                    System.out.println("Player (X) Won The Game");
                    break;
                }
            } else {
                // X Turn
                printBoard();
                int pos = -1;
                do{
                    System.out.println("Please Player(X) inform a Valid Position to play!");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'X');
                positionsAvailable.remove(pos);
                if(checkWinnerX()) {
                    System.out.println("Player (X) Won The Game");
                    break;
                }

                if (checkTie()){
                    System.out.println("It is a Tie nobody Wins the Game!!");
                    break;
                }
                // O Turn
                printBoard();
                do{
                    System.out.println("Please Player(O) inform a Valid Position to play!");
                    pos = input.nextInt();
                }while(!checkValidPosition(pos));
                playAtPosition(pos, 'O');
                positionsAvailable.remove(pos);
                printBoard();
                if(checkWinnerO()) {
                    System.out.println("Player (O) Won The Game");
                    break;
                }
            }
        }
    }

    public void playRandom(){
        int randomMove;
        do{
            randomMove = (int)(Math.random() * 9 +1);
        }while(!positionsAvailable.contains(randomMove));
        playAtPosition(randomMove,'O');
        positionsAvailable.remove(randomMove);
    }
}
