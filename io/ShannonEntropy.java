/* *****************************************************************************
 *  Takes a command-line integer m; reads a sequence of integers between 1 and
 *  m from standard input; and prints the Shannon entropy to standard output,
 *  with 4 digits after the decimal point.
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        // Command-line integer m
        int m = Integer.parseInt(args[0]);
        // Array of frequencies
        int[] frequencies = new int[m];

        int totalFreq = 0;
        double entropy = 0;

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x >= 1 && x <= m) {
                frequencies[x - 1]++;
                totalFreq++;
            }
        }

        for (int i = 0; i < m; i++) {
            // Proportion
            double p = (double) frequencies[i] / totalFreq;
            if (p != 0) {
                entropy -= p * Math.log(p) / Math.log(2);
            }
        }
        StdOut.printf("%.4f\n", entropy);
    }
}
