/* *****************************************************************************
 *  Takes two integer command-line arguments n and trials and performs the
 *  following experiment, trials times:
 *      - Choose a birthday for the next person, uniformly at random between 0
 *        and n−1.
 *      - Have that person enter the room.
 *      - If that person shares a birthday with someone else in the room, stop;
 *        otherwise repeat.
 *
 *  In each experiment, count the number of people that enter the room. Print
 *  a table that summarizes the results (the count i, the number of times that
 *  exactly i people enter the room, and the fraction of times that i or fewer
 *  people enter the room) for each possible value of i from 1 until the
 *  fraction reaches (or exceeds) 50%.
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int numEntered = 0;
        double fraction;

        // Integer array to keep track of the number of times that i people
        // entered the room across all experiments
        int[] numEnteredArray = new int[n + 2];
        // numEnteredArray[0] = 1;

        for (int i = 0; i < trials; i++) {
            // Boolean array to keep track of which birthdays have been encountered
            // so far in a single experiment
            boolean[] bdaysEncountered = new boolean[n];
            // Number of people that entered room
            int numPeople = 0;
            while (true) {
                numPeople++;
                int r = (int) (Math.random() * n);
                if (bdaysEncountered[r]) break;
                bdaysEncountered[r] = true;
            }
            numEnteredArray[numPeople]++;
        }

        // for (int i = 0; i < numEnteredArray.length; i++) {
        //     System.out.print(numEnteredArray[i] + " ");
        // }


        for (int i = 1; i < numEnteredArray.length; i++) {
            numEntered += numEnteredArray[i];
            fraction = (double) numEntered / trials;
            System.out.println(i + "\t" + numEnteredArray[i]
                                       + "\t" + fraction);
            if (fraction >= 0.5) break;
        }
    }
}
