import java.util.Scanner;
public class Question8{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the word");
        String vowed = input.nextLine();
      

    // find A, E, I, O, and U.
    
        int index = vowed.indexOf("a");

        while (index >= 0){
        System.out.print(index + " ");
        vowed = vowed.substring(index + 1);
        index = vowed.indexOf("o");
        }

        // out put to show “Number of vowels in the sentence or word: 6” 
        System.out.println("Number of vowels in the sentence or word: " + index);
    }
}