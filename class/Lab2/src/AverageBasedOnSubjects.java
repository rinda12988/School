import java.util.Scanner;

class AverageBasedOnSubjects{
   public static void main(String args[])
  {
 
    int i;
 
    System.out.println("Enter number of subjects");
 
    Scanner input=new Scanner(System.in);
 
    int number=input.nextInt();
 
    int[] answer=new int[number];
 
    double avg = 0;
 
    System.out.println("Enter marks");
 
    for( i = 0; i < number; i++)
    {
       answer[i] = input.nextInt();
    }
    input.close();
    for( i = 0; i < number; i++)
    {
      avg = avg + answer[i];
    }
 
    System.out.print("Average of (");
 
    for(i = 0; i < number-1; i++)
    {
      System.out.print(answer[i] + ",");
    }
    System.out.println(answer[i] + ") = " + avg / number);
  }
  
}