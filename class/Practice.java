import java.text.DecimalFormat;
public class Practice {
    public static void main(String[] args) {
        double weeklyhourlimit = 60.0 ;
        double employeeworktime[] = {35.0 , 47.0 , 73.0};
        double employeepayrate []= {7.50 , 8.20 , 10.0};
        double salary,overtime;
        //SalaryCalculator
        for(int i = 0; i<= 2;) {
            if (employeeworktime[i]> weeklyhourlimit) {;
            
            System.out.println("Employee "+ (i+1) + " worked "+ employeeworktime[i]%60 +" hours greater than 60 hours");
            }
            i++;
            }
            for(int i = 0; i<= 2;) {
            if (employeepayrate[i]>40 ){
                
            System.out.println("Employee "+ (i+1) + " has to get "+  (Math.round(8 - employeepayrate[i])) +" dollar more");
            }
            i++;    
            }            
                
                    for(int i = 0; i<= 2;) {
                        if (employeeworktime[i] > 40) {
                            overtime = employeeworktime[i]%40;
                            salary =+ overtime * employeepayrate[i] * 1.5+ 40*employeepayrate[i] ;
                            System.out.println("Salary of Employee "+ (i+1) +" is "+salary);    
                            }
                        else {    
                            salary = employeeworktime[i] * employeepayrate[i] ;
                            System.out.println("Salary of Employee "+ (i+1) +" is "+salary);}
                        i++;
                        }
                    
            
}}