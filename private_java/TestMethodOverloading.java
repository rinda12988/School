    public class TestMethodOverloading {
        
        public static void main(String[] args) {
        
        System.out.println(add(3, 4));
        
    
        System.out.println(add(3, 5, 7));
        
        }
        
        
        public static int add(int num1, int num2) {
        return num1 + num2;
        }
        
        
        public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
        }