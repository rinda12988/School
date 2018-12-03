
public class TestBreak{
    public static void main(String [] args){
        int number = 0;
        int sum = 0;
// numberが２０以下だったらこのwhile分は通る。
        while(number < 20){
            // nuumber = number + 1;
            number ++;
            // sum = sum + number;
            sum += number;
            // この場合100までは通るがそれ以降になった途端処理はbreakによって終了する。
            if(sum >= 100)
            break;
            
            }
        
        System.out.println("The number is" + number);
        System.out.println("The sum is" + sum);
    }

}
