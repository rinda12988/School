import java.util.Scanner;
public class Exercise6 {
      public static void main(String args[])
    {
        int dec_num, rem;
       //initialization        
        String hexdec_num="";
        
        /* hexadecimal number digits */
//       　define array
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
//		call number
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
//      if decimal number > 0, do loop
        while(dec_num>0)
        {
//      decimal % 16
            rem = dec_num%16;
//      
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    }
}