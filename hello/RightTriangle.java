/* *****************************************************************************
 *  Takes three int command-line arguments and determines whether they
 *  constitute the side lengths of some right triangle.
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        int int3 = Integer.parseInt(args[2]);

        int min = Math.min(int1, Math.min(int2, int3));
        int max = Math.max(int1, Math.max(int2, int3));
        int median = int1 + int2 + int3 - min - max;

        boolean isPositive = ((int1 > 0) && (int2 > 0) && (int3 > 0));
        boolean isRightTriangle = ((max * max == min * min + median * median) &&
                isPositive);

        System.out.println(isRightTriangle);
    }
}
