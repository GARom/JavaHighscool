/*
 * Uses unit tests for rectangle class
 * 
 * SAMPLE OUTPUT:
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16
 
 */
package rectangleclassrun;

import java.util.Scanner;
import shapes.Rectangle;

public class RectangleClassRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());        
        System.out.printf("Area : %d; Perimeter : %d\n", rect.area(),rect.perimeter());               
    }
}
