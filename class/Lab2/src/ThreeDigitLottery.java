import java.util.Scanner;
 
 
public class ThreeDigitLottery {
	private static int lottery =  99 + (int)(Math.random() * 901);
//	private static int lottery = 123;
    public static void main (String [] args){
 
    //Generate random number with 3 digits
  
    //Start scanner
    Scanner input = new Scanner (System.in);
    //Prompt user to enter three digits
    System.out.println(" Enter the three digit integer");
    int guess = input.nextInt();
    input.close();
    int u1 = guess /100;
    int remainU = guess % 100;
     
    int u2 = remainU /10;
    int u3= remainU % 10;
 
 
    //Get  3 digits from lottery
     
    int d1 = lottery /100;
    int remainN = lottery % 100;
     
    int d2 = remainN /10;
    int d3= remainN % 10;
 
    System.out.println(" The lottery numbers are " + d1 + " " + d2 + " " + d3 + "!");
     
    //**Check the guess and print out the award system.
    /* if users input matches the lottery input in exact order, award is $1000000 */
         
    if (guess == lottery ){
        System.out.println("You have won $1000000. Perfect match!");
 
    /* if all the digits match, award is $30000 */
     
    }else if (((u1 == d1) || (u1 == d2) || (u1 == d3)) && 
            ((u2 == d1) || (u2 == d2) || (u2 == d3)) &&
            ((u3 == d1) || (u3 == d2) || (u3 == d3)) && 
            ((u1 != u2)&&(u1 !=u3)&&(u2 !=u3))){  
        System.out.println("All numbers are correct! You have won $30000.");
         
        /* if at least one digit matches the lottery number the award is $10000 */
         
    }else if (((u1 == d1) || (u1 == d2) || (u1 == d3)) || 
            ((u2 == d1) || (u2 == d2) || (u2 == d3)) ||
            ((u3 == d1) || (u3 == d2) || (u3 == d3))){
        System.out.println("At least one number is correct. You win $10000");
    }else
        System.out.println ("No match");
  }
   
}