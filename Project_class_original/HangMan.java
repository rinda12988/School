package gameplatform;


import java.util.*;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class HangMan {
    //Keep all the letters that the player put
    private HashSet<Character> playedLetters = new HashSet<Character>();
    //Create the words for the player to guess
    private String [] words = {"system", "information", "eclipse", "package", "technology", "double", "algorithm", "programming", "integer","minecraft",
            "cornerstone", "computer", "application", "instructor","snowboarding", "bowling", "protected", "tetris", "battlefield", "refactor"};
    private String hiddenWord;
    private char[] guessWord;




    public void run() {
        // System.out.println( ansi().eraseScreen());
        // System.out.println(ansi().fg(RED).a("   |/|   ▄█    █▄       ▄████████ ███▄▄▄▄      ▄██████▄    ▄▄▄▄███▄▄▄▄      ▄████████ ███▄▄▄▄   "));
        // System.out.println(ansi().fg(RED).a("   | |  ███    ███     ███    ███ ███▀▀▀██▄   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███ ███▀▀▀██▄ "));
        // System.out.println(ansi().fg(RED).a("   |/|  ███    ███     ███    ███ ███   ███   ███    █▀  ███   ███   ███   ███    ███ ███   ███ "));
        // System.out.println(ansi().fg(RED).a("   | | ▄███▄▄▄▄███▄▄   ███    ███ ███   ███  ▄███        ███   ███   ███   ███    ███ ███   ███ "));
        // System.out.println(ansi().fg(RED).a("   |/|▀▀███▀▀▀▀███▀  ▀███████████ ███   ███ ▀▀███ ████▄  ███   ███   ███ ▀███████████ ███   ███ "));
        // System.out.println(ansi().fg(RED).a("  (___)  ███    ███     ███    ███ ███   ███   ███    ███ ███   ███   ███   ███    ███ ███   ███ "));
        // System.out.println(ansi().fg(RED).a("  (___)  ███    ███     ███    ███ ███   ███   ███    ███ ███   ███   ███   ███    ███ ███   ███ "));
        // System.out.println(ansi().fg(RED).a("  (___)  ███    █▀      ███    █▀   ▀█   █▀    ████████▀   ▀█   ███   █▀    ███    █▀   ▀█   █▀  "));
        // System.out.println(ansi().fg(RED).a("  (___)                                                                                          "));
        // System.out.println(ansi().fg(RED).a("  (___)"));
        // System.out.println(ansi().fg(RED).a("  // \\"));
        // System.out.println(ansi().fg(RED).a(" //   \\"));
        // System.out.println(ansi().fg(RED).a("||     ||"));
        // System.out.println(ansi().fg(RED).a("||     ||"));
        // System.out.println(ansi().fg(RED).a("||     ||"));
        // System.out.println(ansi().fg(RED).a(" \\___//"));
        // System.out.println(ansi().fg(RED).a("  -----"));
        // System.out.println(ansi().reset());

        Scanner input = new Scanner(System.in);
        System.out.println("* Welcome to the Hangman game *" + "\n");
        System.out.println("RULE: You have only six attempts and every wrong letter, you will lose the members of the man until he dies" + "\n");
        boolean play = true;
        while (play) {
            //The system chooses randomly the word to play
            hiddenWord = words[(int) (Math.random() * words.length)];
            guessWord = new char[hiddenWord.length()];
            //Print underscore according to the number of the letters
            for(int j = 0; j < guessWord.length; j++) {
                guessWord[j] = '_';
            }
            //Show to the player the number of letters that the word has
            int wordSize = hiddenWord.length();
            System.out.println("Hint: the word has " + wordSize + " lower case letters");
            System.out.println("\n\n");
            //Checking the attempts according to the correct letter that the player put
            int error = 0;
            while(error < 6) {
                //Checking the position of the letter that the player put
                printGuessWord();
                printplayedLetters();
                System.out.print("\n" + "Guess a letter, (0) to exit: ");
                char userGuess = input.next().toLowerCase().charAt(0);
                if (userGuess =='0'){
                    play = false;
                    break;
                }
                playedLetters.add(userGuess);
                boolean correct = false;
                for(int i = 0;i < hiddenWord.length(); i++) {
                    if(hiddenWord.charAt(i) == userGuess) {
                        guessWord[i] = userGuess;
                        correct = true;
                    }
                }

                // Check if the letter exist in the word
                if (correct == false) {
                    error++;
                    System.out.println("This letter it doesn't exist, guess another letter");
                }else {
                    if (Arrays.equals(guessWord,hiddenWord.toCharArray())){
                        System.out.println("|\n You win ! ");
                        playedLetters.clear();
                        break;

                    }
                    System.out.println("\n" + "Good! Try another letter");
                }
                drawMan(error);
                if (error == 6) {
                    System.out.println("|\n You lost ! ");
                    System.out.println(" The correct word is : " + hiddenWord);
                    playedLetters.clear();
                    break;
                }

            }

            System.out.println("\n Do you want to play again? ('Y' to play or 'N' to exit)?");
            //If the player want to play again
            char playAgain = input.next().charAt(0);
            if (playAgain == 'Y' || playAgain == 'y') {

                // If the user don't want to play again
            } else {
                play = false;
                endGame();
            }
        }
    }
    //Method to keep the letters that the player put
    private void printplayedLetters() {
        System.out.println(playedLetters.toString());
    }
    //Method to put the guess letter in the correct position
    private void printGuessWord() {
        System.out.println("");
        for(int x = 0; x < guessWord.length; x++) {
            if(guessWord[x] == '_')
                System.out.print(" _ ");
            else
                System.out.print(" " + guessWord[x] + " ");
        }
        System.out.println("");
        System.out.println("");
    }
    //Method to draw the man according to the player attempts
    private void drawMan(int error) {
        if (error == 0) {
            System.out.println("\n\n" + " O");
            System.out.println("-" + "|" + "-");
            System.out.println("/" + " \\" + "\n");
        } else if (error == 1) {
            System.out.println("\n\n" + " O");
            System.out.println("-" + "|" + "-");
            System.out.println("/" + "\n");
        } else if (error == 2) {
            System.out.println("\n\n" + " O");
            System.out.println("-" + "|" + "-");
        } else if (error == 3) {
            System.out.println("\n\n" + " O");
            System.out.println("-" + "|");
        } else if (error == 4) {
            System.out.println("\n\n" + " O");
            System.out.println(" |");
        } else if (error == 5) {
            System.out.println("\n\n" + " O");
        } else if (error == 6) {
        }
    }


    //Method to finish the game
    private void endGame() {
        System.out.println("\n THE END  \n");
    }
}
