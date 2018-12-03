import java.util.Scanner;
public class GreatestCommonDivisor{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
// gcdとは二つの整数が最大でどの数で割れるかを示す。ここでは初期化するためにint gcd = 1;としてある。
// なぜなら約数は１から。
        int gcd = 1;
// 二つの整数をk = 2;で割る。
        int k = 2;
 //二つの整数が割る数を超えてないかの判定。超えてたらもちろんループは終わりアウトプットされる。 
        while (k <= n1 && k <= n2){
         if(n1% k == 0 && n2 % k ==0)
// 二つの整数がKで割れればgcd = k;
            gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + 
        " and " + n2 + " is " + gcd);

    }
}
// p180 GreatestCommonDivisor　最大公約数　Scannerを呼び出して整数をインプットさせ
// 二つの整数をwhile分（ふたつのどちらかの整数になるまで）とif分（もしふたつの整数が割り切れるなら）
// アウトプットして終了。