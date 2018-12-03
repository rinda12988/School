import java.util.Scanner;

public class DoSomethingMain {
public static void main(String[] args) {
	DoSomething what = new DoSomething();
	
	Scanner input = new Scanner(System.in);
	System.out.println("Tell me a string that has a decent length with some spaces inside");
	String inputText = input.nextLine();
	what.removeSpace(inputText);
	input.close();
}
}
