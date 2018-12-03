public class CheckIndex{
    public static void main(String[]args){

    


String s = "How do you do?";
int index = s.indexOf("o");

while (index >= 0){
System.out.print(index + " ");
s = s.substring(index + 1);
index = s.indexOf("o");
}
    }
}