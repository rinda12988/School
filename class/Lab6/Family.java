import java.util.Scanner;
public class Family{
    public static void main(String[]args){
        System.out.println("what is your story?");
        Scanner scanner = new Scanner(System.in);
        // input story
        String story = scanner.nextLine();
        // System.out.println(story);

        if(story.contains("mother")){

          //indexOf
          int index = story.indexOf("mother");
            
          //substring
          String substr = story.substring(index,story.length());
          System.out.println(story);      

        }  
    }
}
