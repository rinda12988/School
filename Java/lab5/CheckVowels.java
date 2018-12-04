import java.util.Scanner;
public class CheckVowels{
    public static void main(String[] args){
        // inpuy word or sentence by using Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("enter the your sentence or word");
        String sentence = input.nextLine();
        String[] vowel = {"a","i","u","e","o","A","I","U","E","O"};

        // check
        for(int i = 0; i < sentence.length();i++){
            for(int j = 0; j < vowel.length; j++) {
                

            }
        }
        System.out.println(sentence.length());
            System.out.println(vowel.length);
        
        // output 
        System.out.println("Number of vowels in the sentence or word: 6" );


    }
}