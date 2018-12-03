
 public class PrimeNumbers {
 public static void main(String[] args) {
 
 

 final int NUMBER_PER_LINE = 2; // Display 2 per line
 int count = 0; // Count the number of prime numbers
 int number = 5; // minimum　number to find prime number
 int n = 200;// maximam number to find  prime number


 // Repeatedly find prime numbers
 while (number <= n) {
 // Assume the number is prime
 boolean isPrime = true; // Is the current number prime?


 // Test if number is prime
 for (int divisor = 2; divisor <= (int)(Math.sqrt(number)); divisor++) {
 if (number % divisor == 0) { // If true, number is not prime
 isPrime = false; // Set isPrime to false
 break; // Exit the for loop
 }
 }

 // Print the prime number and increase the count
 if (isPrime) {
 count++; // Increase the count

 if (count % NUMBER_PER_LINE == 0) {
 // Print the number and advance to the new line
 System.out.println(number + ">");
 }
 else
 System.out.print("<" + number +"," );
 }

 // Check if the next number is prime
 number++;
 }


 }
 }