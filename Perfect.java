/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */

public class Perfect {
    public static void main (String[] args) {

        // Parse the first command-line argument as an integer
        int num = Integer.parseInt(args[0]);
        int sum = 1;
        // Initialize the string to represent divisors
        String perfectStr = args[0] + " = 1";

        // Check if the number is 0 and if so, print a message accordingly
        if (num == 0){
            System.out.println("0 Doesn't have any divisors");
        }
        else {
            if (num > 0){
                // Find divisors from 2 to num/2 and calculate the sum of divisors
                for (int i = 2; i < num/2 + 1; i++){
                    if (num % i == 0){
                        // Add the divisor to the sum
                        sum += i;
                        perfectStr += String.format(" + %d", i);
                    }
                }
                // Check if the sum of divisors equals the original number and print a message accordingly
                if (sum == num){
                    String output = String.format("%d is a perfect number since ", num) + perfectStr;
                    System.out.println(output);
                } else {
                    System.out.println(num + " is not a perfect number");
                }
            }
        }
    }
}