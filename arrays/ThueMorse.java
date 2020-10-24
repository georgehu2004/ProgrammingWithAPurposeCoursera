/* *****************************************************************************
 *  Takes an integer command-line argument n and prints an n-by-n pattern.
 *  Include two space characters between each + and - character.
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int n2 = 0;

        /* If n is not a power of 2, increase n to the next power of 2
        For example: if n = 8, n remains 8, but if n = 9, n becomes 16. */
        if (!((n & n - 1) == 0)) {
            n2 = (int) Math.pow(2, (int) (Math.log(n) / Math.log(2)) + 1);
        }
        else {
            n2 = n;
        }

        // System.out.println("n = " + n);

        /* Thue-Morse sequence construction (based on alternative strategy in
        FAQ -- link below)
        https://coursera.cs.princeton.edu/introcs/assignments/arrays/faq.php */
        int[] array = new int[n2];
        array[0] = 0;

        for (int i = 1; i < n2; i++) {
            // If i is even, array[i] = array[i / 2]
            if (i % 2 == 0) {
                array[i] = array[i / 2];
            }
            // If i is odd, array[i] = 1 - array[i - 1]
            else {
                array[i] = 1 - array[i - 1];
            }
        }

        // Thue-Morse weave construction
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // If bits i and j in the sequence are equal, print a "+"
                if (array[i] == array[j]) {
                    System.out.print("+  ");
                }
                // If bits i and j in the sequence are different, print a "-"
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
