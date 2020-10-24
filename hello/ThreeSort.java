/******************************************************************************
 *  Compilation:  javac ThreeSort.java
 *  Execution:    java ThreeSort integer1 integer2 integer3
 *
 *  Takes three integer command-line arguments and prints them in
 *  ascending order.
 *
 *  % java ThreeSort 10 5 7
 *  5 7 10
 *
 ******************************************************************************/

public class ThreeSort {
    public static void main(String[] args) {
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        int int3 = Integer.parseInt(args[2]);

        int minimum = Math.min(int1, Math.min(int2, int3));
        int maximum = Math.max(int1, Math.max(int2, int3));
        int median = int1 + int2 + int3 - minimum - maximum;

        System.out.println(minimum + " " + median + " " + maximum);
    }
}
