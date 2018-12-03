import java.util.Scanner;
public class Palindrome{
    public static void main(String [] args){
        // scanner　を呼び出す。
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string");
        // nextLineでsに代入してStringとして定義する
        String s = input.nextLine();
        // 左から数えるための定義   
        int low = 0;
        // 右から数えるための定義　この時lengthで0から始まるので−１をして１にする。
        int high = s.length() - 1;
        // ouputするときの判断のため
        boolean isPalindrome = true;
        // while分でlowとhighで左右から調べさせる。
        while(low < high){
        // if分でもしもlowのstringsとhighのstringsが同じ出なければfalseと返してbreakで終わらせる。
            if(s.charAt(low)!= s.charAt(high)){
                isPalindrome = false;
                break;
            }
        //lowに１足してhighに１引いてを忘れずになぜif分に書かないかというとbreakが最後についてるから。 
                 low++;
                  high--;
            }
        // もしもisPalindromeがtrueだったらs + " is a palindrome"
        // 違うのならis not a palindrome　

                  if (isPalindrome)
                  System.out.println(s + " is a palindrome");
                  else
                   System.out.println(s + " is not a palindrome");
                   }
                    }
                