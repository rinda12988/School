public class ACorp {
    public static void main(String[] args) {
        Employee employee1 = new Employee(); //Creating Employee constructor instance
        employee1.setPayPerHour(7.50); //Getting the method of Employee class using double argument
        employee1.setOverTimePayPerHour(); //Getting the method of Employee class using double argument
        employee1.setHours(35); //Getting the method of Employee class using double argument
        employee1.calculateTotalPay(); //Getting the method of Employee class using double argument
        System.out.println("Employee1 worked  " + employee1.getBasePayHours() + " regular hours."); //should be 40
        System.out.println("Plus " + employee1.getOverTimeHours() + " hours of overtime.");
        System.out.println("For a total of " + employee1.getTotalHours() + " hours."); //should be 35
        System.out.println("You get paid $" + employee1.getpayPerHour() + " per hour."); //should be 7.50
        System.out.println("You get paid $" + employee1.getOverTimePayPerHour() + "  per hour for overtime.");
        System.out.println("Your total pay is: $" + employee1.getTotalPay() + "\n");

        Employee employee2 = new Employee();
        employee2.setPayPerHour(8.20);
        employee2.setOverTimePayPerHour();
        employee2.setHours(47);
        employee2.calculateTotalPay();
        System.out.println("Employee2 worked  " + employee2.getBasePayHours() + " regular hours."); //should be 40
        System.out.println("Plus " + employee2.getOverTimeHours() + " hours of overtime.");
        System.out.println("For a total of " + employee2.getTotalHours() + " hours."); //should be 47
        System.out.println("You get paid $" + employee2.getpayPerHour() + " per hour."); //should be 8.20
        System.out.println("You get paid $" + employee2.getOverTimePayPerHour() + "  per hour for overtime.");
        System.out.println("Your total pay is: $" + employee2.getTotalPay() + "\n");

        Employee employee3 = new Employee();
        employee3.setPayPerHour(10.00);
        employee3.setOverTimePayPerHour();
        employee3.setHours(73);
        employee3.calculateTotalPay();
        System.out.println("Employee3 worked  " + employee3.getBasePayHours() + " regular hours."); //should be 40
        System.out.println("Plus " + employee3.getOverTimeHours() + " hours of overtime."); // should be 7.00
        System.out.println("For a total of " + employee3.getTotalHours() + " hours."); //should be 73
        System.out.println("You get paid $" + employee3.getpayPerHour() + " per hour."); //should be 10.00
        System.out.println("You get paid $" + employee3.getOverTimePayPerHour() + "  per hour for overtime.");
        System.out.println("Your total pay is: $" + employee3.getTotalPay());
    }

}