/******************************************************************************
 *  Compilation:  javac UniformRandomNumbers.java
 *  Execution:    java UniformRandomNumbers
 *
 *  Prints five uniform random numbers between 0 and 1, their average value,
 *  and their minimum and maximum values.
 *
 *  % java UniformRandomNumbers
 *  1st number: 0.352475436499074
 *  2nd number: 0.180990834821529
 *  3rd number: 0.8756815633872393
 *  4th number: 0.9863592102318618
 *  5th number: 0.4231667694324087
 *  Average: 0.5637347628744226
 *  Minimum: 0.180990834821529
 *  Maximum: 0.9863592102318618
 *
 ******************************************************************************/

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();

        double average = (num1 + num2 + num3 + num4 + num5) / 5;
        double minimum = Math.min(num1, Math.min(Math.min(num2, num3), Math.min(num4, num5)));
        double maximum = Math.max(num1, Math.max(Math.max(num2, num3), Math.max(num4, num5)));
        
        System.out.println("1st number: " + num1);
        System.out.println("2nd number: " + num2);
        System.out.println("3rd number: " + num3);
        System.out.println("4th number: " + num4);
        System.out.println("5th number: " + num5);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
