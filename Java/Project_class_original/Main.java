package gameplatform;

import java.util.Scanner;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter;

        while (true){

            // System.out.println("");
            // System.out.println("");
            // System.out.println(ansi().fg(RED).a(" ██████╗  █████╗ ███╗   ███╗███████╗    ██████╗ ██╗      █████╗ ████████╗███████╗ ██████╗ ██████╗ ███╗   ███╗"));
            // System.out.println(ansi().fg(GREEN).a("██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔══██╗██║     ██╔══██╗╚══██╔══╝██╔════╝██╔═══██╗██╔══██╗████╗ ████║"));
            // System.out.println(ansi().fg(YELLOW).a("██║  ███╗███████║██╔████╔██║█████╗      ██████╔╝██║     ███████║   ██║   █████╗  ██║   ██║██████╔╝██╔████╔██║"));
            // System.out.println(ansi().fg(CYAN).a("██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██╔═══╝ ██║     ██╔══██║   ██║   ██╔══╝  ██║   ██║██╔══██╗██║╚██╔╝██║"));
            // System.out.println(ansi().fg(MAGENTA).a("╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ██║     ███████╗██║  ██║   ██║   ██║     ╚██████╔╝██║  ██║██║ ╚═╝ ██║"));
            // System.out.println(ansi().fg(BLUE).a(" ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝"));
            // System.out.println(ansi().reset());

            System.out.println("");
            System.out.println("");
            System.out.println("Please feel Free to choose one of the following games to Play!");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - Hangman");
            System.out.println("2 - BlackJack");
            System.out.println("3 - Tic-Tac-Toe");
            System.out.println("4 - Rules");
            System.out.println("0 - Exit!");
            System.out.println("");
            System.out.print("Please Inform Your Choice:  ");


            letter = input.nextLine().charAt(0);

            switch (letter){
                case '1':
                    System.out.println("HangMan Selected" + "\n");
                    HangMan hangMan = new HangMan();
                    hangMan.run();
                    break;
                case '2':
                    System.out.println("BlackJack Selected!!!!" + "\n");
                    BlackJack blackJack = new BlackJack();
                    blackJack.run();
                    break;
                case '3':
                    System.out.println("Tic-Tac-Toe Selected" + "\n");
                    TicTacToe tictactoe = new TicTacToe();
                    tictactoe.run();
                    break;
                case '4':
                    System.out.println("Rules Selected" + "\n");
                    Rules rules = new Rules();
                    rules.run();
                    break;
                case '0':
                    System.out.println("Thank You!!!!");
                    System.out.println("");
                    System.out.println("Good Bye!!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please inform a Correct Option");
                    break;
            }
        }
    }
}