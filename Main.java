package hw1;

import hw1.labyrinth.*;

public class Main {
    /* Change this constant to contain your name.
     *
     * WARNING: Once you've set set this constant and started exploring your maze,
     * do NOT edit the value of kYourName. Changing kYourName will change which
     * maze you get back, which might invalidate all your hard work!
     */
    
   




    private static final String YOUR_NAME = "Tony Xavier";

    /* Change these constants to contain the paths out of your mazes. */
    private static final String PATH_OUT_OF_MAZE        = "ESSWENNWNEEESNWSSES";
    private static final String PATH_OUT_OF_TWISTY_MAZE = "NNEESSNNWW";

    public static void main(String[] args) {
        MazeCell startLocation = MazeUtilities.mazeFor(YOUR_NAME);
       
        /* Set a breakpoint here to explore your maze! */
        int i = 1;
        
        
        if (MazeUtilities.isPathToFreedom(startLocation, PATH_OUT_OF_MAZE)) {
            System.out.println("Congratulations! You've found a way out of your labyrinth.");
        } else {
            System.out.println("Sorry, but you're still stuck in your labyrinth.");
        }
        
        
         MazeCell twistyStartLocation = MazeUtilities.twistyMazeFor(YOUR_NAME);
        
        /* Set a breakpoint here to explore your twisty maze! */
        int m = 1;

        if (MazeUtilities.isPathToFreedom(twistyStartLocation, PATH_OUT_OF_TWISTY_MAZE)) {
            System.out.println("Congratulations! You've found a way out of your twisty labyrinth.");
        } else {
            System.out.println("Sorry, but you're still stuck in your twisty labyrinth.");
        }
    }
}
