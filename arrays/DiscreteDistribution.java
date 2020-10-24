/* *****************************************************************************
 *  Takes an integer command-line argument m, followed by a sequence of
 *  positive integer command-line arguments a1,a2,…,an, and prints m random
 *  indices (separated by whitespace), choosing each index i with probability
 *  proportional to ai.
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);  // Command-line argument m
        int n = args.length;
        int[] a = new int[n];  // Command-line arguments a1, a2, ... , an

        int[] cumSum = new int[n];
        // cumSum[0] = 0;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            // Create array of a1, a2, ... , an
            a[i] = Integer.parseInt(args[i]);
            // Define cumulative sums Si
            sum += a[i];
            cumSum[i] = sum;
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(cumSum[i] + " ");
        // }

        for (int i = 1; i <= m; i++) {
            // Pick a random integer r uniformly between 0 and Sn-1
            int r = (int) (Math.random() * cumSum[n - 1]);
            // Find unique index i between 1 and n such that Si-1 <= r < Si
            for (int j = 1; j < n; j++) {
                if (r < cumSum[j] && r >= cumSum[j - 1]) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
