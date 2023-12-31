/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {

        // Parse the first command-line argument as an integer to determine board size
        int boardSize = Integer.parseInt(args[0]);
        String line = "";

        // Check if the board size is less than 2 and if so print a message accordingly
        if (boardSize < 2){
            System.out.println("Damka board requires a positive integer bigger than 1");
        }else {
            // Loop through rows (boardSize times) to create the Damka board
            for (int i = 0; i < boardSize; i++){
                // Loop through columns (boardSize times) to create each line of the board
                for (int j = 0; j < boardSize; j++){
                    // Check if the row number is even or odd to create alternating pattern of '* ' and ' *'
                    if (i % 2 == 0){
                        line += "* ";
                    } else {
                        line += " *";
                    }
                }
                // Print the line representing a row of the Damka board
                System.out.println(line);
                // Reset the line for the next row
                line = "";
            }
        }
    }
}
