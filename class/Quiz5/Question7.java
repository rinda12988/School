public class Question7{
public static void whatsIt(int n){
    if (n > 10)
    whatsIt(n / 10);
    System.out.print(n % 10);
}
public static void main(String[]args){
    Question7 a = new Question7();
    a.whatsIt(347);
}
}


