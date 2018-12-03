import java.util.Scanner;
 
 
public class TestLottery {
    public static void main (String [] args){
 
    //Generate random number with 3 diggits
//    int randomNumber = 100 + (int)(Math.random() * ((999 - 100)+1)); 
    	int randomNumber = 123;
    //Start scanner
    Scanner input = new Scanner (System.in);
    //Prompt user to enter three digits
    System.out.println(" Enter the three digit integer");
    int userNumber = input.nextInt();
     
    int u1 = userNumber /100;
    int remainU = userNumber % 100;
     
    int u2 = remainU /10;
    int u3= remainU % 10;
 
 
    //Get  3 digits from lottery
     
    int d1 = randomNumber /100;
    int remainN = randomNumber % 100;
     
    int d2 = remainN /10;
    int d3= remainN % 10;
 
    System.out.println(" The lottery numbers are " + d1 + " " + d2 + " " + d3 + "!");
     
    //**Check the guess and print out the award system.
    /* if users input matches the lottery input in exact order price is 10000$*/
         
    if (userNumber == randomNumber ){
        System.out.println("You have won 10000 €. Perfect match!");
 
    /* if all the digits match price is 3000$ */
     
    }else if (((u1 == d1) || (u1 == d2) || (u1 == d3)) && 
            ((u2 == d1) || (u2 == d2) || (u2 == d3)) &&
            ((u3 == d1) || (u3 == d2) || (u3 == d3))){  
        System.out.println("All numbers are correcnt! You have won 3000 €.");
         
        /* if at least one digit matches the lottery number the award is 1000$ */
         
    }else if (((u1 == d1) || (u1 == d2) || (u1 == d3)) || 
            ((u2 == d1) || (u2 == d2) || (u2 == d3)) ||
            ((u3 == d1) || (u3 == d2) || (u3 == d3))){
        System.out.println("At least one number is correct. You win 1000 €");
    }else
        System.out.println ("No match");
  }
}