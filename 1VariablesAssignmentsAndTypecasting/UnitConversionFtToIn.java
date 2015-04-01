/*  
 * This program will convert an input value in inches to feet and inches.
 * There are 12 inches in a foot. 
 * The remainder are the leftover inches
 * Examples:    15 inches = 1 foot 3 inches.
 *              32 inches = 2 feet 8 inches.
 */

import java.util.Scanner;

public class UnitConversionFtToIn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in inches : ");
        int inputInches = input.nextInt();
        int ft, in;
        ft = inputInches / 12;
        in = inputInches % 12;
        System.out.printf("%d inches == %d feet %d inches\n"
                , inputInches, ft, in);
    }
}
