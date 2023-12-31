/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main (String[] args) {

        int range = 10;
        // Generates the first random number
        int num = (int) (Math.random() * range);
        boolean nonDecreasing = true;

        // Loop continues as long as the sequence is non-decreasing
        while (nonDecreasing){
            System.out.println(num);
            // Generate a new random number
            int newNum = (int) (Math.random() * range);
            // Check if the new number is greater than or equal to the current number
            if (newNum >= num){
                // Update the current number if it forms a non-decreasing sequence
                num = newNum;
            } else {
                // Set the flag to false if the sequence is no longer non-decreasing
                nonDecreasing = false;
            }
        }
    }
}
