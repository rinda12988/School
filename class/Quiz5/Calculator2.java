public class Calculator2 {
    int num = 100;
    public void calc(int num) {
    this.num = num * 10;
    }
    public void printNum(){
    System.out.println(num);
    }
    public static void main(String[] args) {
    Calculator2 obj = new Calculator2 ();
    obj.calc(2);
    obj.printNum();
    }
    }