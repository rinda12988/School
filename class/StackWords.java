import java.util.Scanner;

public class StackWords{
    public static void stackWords(){
        Scanner input = new Scanner(System.in);
        String word = input.next();
    if(word.equals("."))
       System.out.println();
    else
stackWords();
System.out.println(word);
input.close();
    }

    public static void main(String args[]){
        System.out.println("Enter list of words, one per line.");
        System.out.println("Final word should be a period(.)");
        stackWords();
    }
}