/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
    public static void main (String[] args) {

        // Parsing the first command-line argument as an integer
        int num = Integer.parseInt(args[0]);

        // If the number is positive, find divisors from 1 to num/2
        if (num > 0){
            for (int i = 1; i < num/2 + 1; i++){
                // Check if 'i' is a divisor of 'num'
                if (num % i == 0){
                    System.out.println(i);
                }
            }
        }
        // If the number is negative, find divisors from -1 to num/2
        if (num < 0) {
            for (int i = -1; i > num/2 - 1; i--){
                // Check if 'i' is a divisor of 'num'
                if (num % i == 0){
                    System.out.println(i);
                }
            }
        }
        // Print the number itself if it's not equal to zero, as he is the last divisor
        if (num != 0) {
            System.out.println(num);
        }
    }
}
