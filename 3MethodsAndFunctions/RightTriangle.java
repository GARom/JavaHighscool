/* 

Allows the user to give 2 sides of a right triangle and uses 
the Pythagorean formula to get the third side. Also calculates the 
perimeter and area using knowldege of all 3 sides

SAMPLE OUTPUT:

Enter Right Triangle Side A : 3
Enter Right Triangle Side B : 4
Area: 6.000000; Perimeter: 12.000000

*/
import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        // TODO code application logic here get input, 
        // calculate area, perimeter then display output.
        int sideA, sideB;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Right Triangle Side A : ");
        sideA = input.nextInt();
        System.out.print("Enter Right Triangle Side B : ");
        sideB = input.nextInt();
        double perimeter = trianglePerimeter(sideA, sideB);
        double area = triangleArea(sideA, sideB);
        System.out.printf("Area: %f; Perimeter: %f\n",area,perimeter);
    }
    /**
     * Calculates the area of a right triangle
     * @param a side a length
     * @param b side b  length
     * @return the area as a double
     */
    public static double triangleArea( int a, int b) {
        return 0.5*a*b;
    }
    
    /**
     * Calculates the perimeter of a right triangle
     * @param a side a length
     * @param b side b length 
     * @return the perimeter as a double
     */
    public static double trianglePerimeter( int a, int b) {
        double c = Math.sqrt(a*a + b*b);
        return a + b + c;
    }
}
