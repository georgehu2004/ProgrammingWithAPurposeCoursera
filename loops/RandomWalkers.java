/* *****************************************************************************
 *  Takes two integer command-line arguments r and trials. In each of trials
 *  independent experiments, simulate a random walk until the random walker is
 *  at Manhattan distance r from the starting point. Print the average number
 *  of steps.
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;

        for (int i = 1; i <= trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                // Generate random number to pick a random direction
                double rand = Math.random();

                if (rand < 0.25) {
                    // Walk north
                    y++;
                    steps++;
                }
                else if (rand < 0.50) {
                    // Walk east
                    x++;
                    steps++;
                }
                else if (rand < 0.75) {
                    // Walk south
                    y--;
                    steps++;
                }
                else {
                    // Walk west
                    x--;
                    steps++;
                }
            }
            totalSteps += steps;
        }
        double avgSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + avgSteps);
    }
}
