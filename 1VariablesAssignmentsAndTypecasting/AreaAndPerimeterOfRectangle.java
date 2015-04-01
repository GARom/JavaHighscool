/* 
 * Takes inputs of length and width and returns area/perimeter.
 *  Area = Length x Width
 *  Perimeter 2 x Length x Width
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

    public static void main(String[] args) {
        // variables
        int length, width, area, perimeter;
        Scanner input = new Scanner(System.in);
        // inputs
        System.out.print("Enter Length : ");
        length = input.nextInt();
        System.out.print("Enter Width : ");
        width = input.nextInt();
        // calculations
        area = length * width;
        perimeter = 2 * (length + width);
        // outputs
        System.out.printf("Perimeter : %d\n", perimeter);
        System.out.printf("Area : %d\n", area);
    }
}
