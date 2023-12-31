/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main (String[] args){

        // Retrieve the first command-line argument and store it as a string
        String str = args[0];
        String reversedStr = "";

        // Check if the input string is empty
        if (str.isEmpty()){
            System.out.println("The string is empty");
        }
        else {
            // Reverse the string character by character using a for loop
            for (int i = str.length() - 1; i >= 0; i--){
                reversedStr = reversedStr + str.charAt(i);
            }
            // Print the reversed string
            System.out.println(reversedStr);
            // Print the middle character of the original string
            System.out.println("The middle character is " + str.charAt((str.length() - 1) / 2));
        }
    }
}
