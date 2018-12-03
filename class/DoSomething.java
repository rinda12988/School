public class DoSomething{
    public static void main(String[]args){

int[] arr = {1, 2, 3, 4};


public void doSomething(int[] list){
int[] b = list;
for (int i = 0; i < b.length; i++)
b[i] = i;
}

doSomething(arr);
System.out.print(arr[1] + " ");
System.out.print(arr[3]);
    }
}