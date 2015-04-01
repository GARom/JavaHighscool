/* 
Asks and displays the soccer player name, averate points, and height
in feet and inches.

There are 12 inches in 1 ft. so 75 inches is 6ft 3inches
 */

import java.util.Scanner;

public class SoccerPlayer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;
        int heightInInches;
        double avgPtsPerGame;
        System.out.print("Enter Soccer Player's Name: ");
        playerName = input.nextLine();
        System.out.printf("Enter %s's Average Points Per Game: ", playerName);
        avgPtsPerGame = input.nextDouble();
        System.out.printf("Enter %s's Height In Inches  ", playerName);
        heightInInches = input.nextInt();
        int heightInFeet = heightInInches / 12;
        int remainingInches = heightInInches % 12;

        System.out.printf(
            "%s is %d feet %d inches tall and averages %f points per game.\n",
            playerName,
            heightInFeet,
            remainingInches,
            avgPtsPerGame
        );        
    }
}