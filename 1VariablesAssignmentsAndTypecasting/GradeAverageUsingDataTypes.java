import java.util.Scanner; // The scanner allows input

public class GradeAverageUsingDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);        
        String studentName;
        int age;       
        boolean isFemale;
        double gpa;
        
        System.out.print("Enter student's name : ");
        studentName = input.nextLine();        
        System.out.print("Enter student's age : ");
        age = input.nextInt();
        System.out.print("Is this student female? (true/false) : ");
        isFemale = input.nextBoolean();
        System.out.print("Enter student's gpa : ");
        gpa = input.nextDouble();
               
        System.out.printf("%s is %d years old. %s has a %4.3f gpa.\n",
                studentName,
                age,
                (isFemale ? "She" : "He"),
                gpa);
    }
}


