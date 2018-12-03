import java.util.Scanner;

public class ArrangeNameInOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tell me the first name of the first person");
		String firstName1 = input.nextLine();
		System.out.println("Tell me the last name of the first person");
		String lastName1 = input.nextLine();
		
		System.out.println("Tell me the first name of the second person");
		String firstName2 = input.nextLine();
		System.out.println("Tell me the last name of the second person");
		String lastName2 = input.nextLine();
		
		Name person1 = new Name(firstName1, lastName1);
		Name person2 = new Name(firstName2, lastName2);
		
		System.out.println("The first person's name is:" + person1.toString());
		System.out.println("The second person's name is:" + person2.toString());
		
		if (person1.compareTo(person2) < 0)
			System.out.println("The names in alphabetical order are " +
			person1 + " and " + person2);
			else
			System.out.println("The names in alphabetical order are " +
			person2 + " and " + person1);
		
		input.close();
	}

}
