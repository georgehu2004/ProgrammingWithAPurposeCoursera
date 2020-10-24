/* *****************************************************************************
 *  Takes an integer command-line argument r and simulates the motion of a
 *  random walk until the random walker is at Manhattan distance r from the
 *  starting point. Print the coordinates at each step of the walk (including
 *  the starting and ending points), treating the starting point as (0, 0).
 *  Also, print the total number of steps taken.
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) < r) {
            // Generate random number to pick a random direction
            double rand = Math.random();

            if (rand < 0.25) {
                // Walk north
                y++;
                steps++;
                System.out.println("(" + x + ", " + y + ")");
            }
            else if (rand < 0.50) {
                // Walk east
                x++;
                steps++;
                System.out.println("(" + x + ", " + y + ")");
            }
            else if (rand < 0.75) {
                // Walk south
                y--;
                steps++;
                System.out.println("(" + x + ", " + y + ")");
            }
            else {
                // Walk west
                x--;
                steps++;
                System.out.println("(" + x + ", " + y + ")");
            }
        }
        System.out.println("steps = " + steps);
    }
}
