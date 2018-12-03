class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        
        finalPosition = (0.5 * gravity* 10*10 + initialVelocity* 0 ) +  initialPosition;
        System.out.printf("The object's position after %.1f" , fallingTime ); //After %, positive number means digits(right aligned). After ., number means decimal point digits.
        System.out.printf(" seconds is %.2f", finalPosition); // After %, negative number means digits(left aligned). 
        System.out.print("m.");
    }
} 