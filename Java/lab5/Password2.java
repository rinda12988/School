import java.util.Scanner;
public class Password2{
    public static void main(String [] args){
 
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");

        // create new Scanner
        Scanner input = new Scanner(System.in);
        // ask password
        char password  = input.next();

        if(Character.isLetterOrDigit(password)){
            System.out.println("Password is valid: "+ password);
        }else{
            System.out.println("Not a valid password:" + password);
        }



    
    }
    
}