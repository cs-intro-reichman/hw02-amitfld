import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
    public static void main (String[] args) {
        // Gets the two command-line arguments
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        // Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);

        // Initialize all the required variables
        int kidsCount, twoKids = 0, threeKids = 0, fourKidsOrMore = 0, totalKids = 0, commonFamily, max;
        boolean girl, boy;
        double num, averageKids;
        String output = "";

        // Loop 'T' times to simulate 'T' families
        for (int i = 0; i < T; i++){
            kidsCount = 0;
            girl = false;
            boy = false;

            // Simulate the birth of children in a family until at least one boy and one girl are born
            while(!girl || !boy){
                // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
                num = generator.nextDouble();
                // If the generated number is bigger than or equal to 0.5 it's a boy
                if (num >= 0.5){
                    boy = true;
                }
                // If the generated number is less than 0.5 it's a girl
                if (num < 0.5){
                    girl = true;
                }
                // Increment the count of children in the family and the count of total children across all families
                kidsCount ++;
                totalKids ++;
            }
            // Update counters based on the number of children in each family
            if (kidsCount == 2) {
                twoKids++;
            }
            if (kidsCount == 3){
                threeKids ++;
            }
            if (kidsCount >= 4){
                fourKidsOrMore ++;
            }
        }
        // Calculate the average number of children needed to get at least one of each gender
        averageKids = (double) totalKids / T;
        // Determine the most common number of children in families
        max = Math.max(Math.max(twoKids, threeKids), fourKidsOrMore);
        if (max == twoKids){
            commonFamily = 2;
        } else {
            if (max == threeKids){
                commonFamily = 3;
            }else{
                commonFamily = 4;
            }
        }
        // Construct the output message with statistics about the families and children
        output = "Average: " + averageKids + " children to get at least one of each gender.\n";
        output += "Number of families with 2 children: " + twoKids + "\n";
        output += "Number of families with 3 children: " + threeKids + "\n";
        output += "Number of families with 4 or more children: " + fourKidsOrMore + "\n";
        output += "The most common number of children is " + commonFamily + ".";

        // Print the output message displaying the statistics
        System.out.println(output);

    }
}
