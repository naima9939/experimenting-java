import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // Get player's choice
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String player = sc.nextLine().toLowerCase();
        
        // Computer selects randomly: 0=rock, 1=paper, 2=scissors
        int computerNum = random.nextInt(3);
        String computer;
        
        // Convert computer number to choice using if-else
        if (computerNum == 0) {
            computer = "rock";
        } else if (computerNum == 1) {
            computer = "paper";
        } else {
            computer = "scissors";
        }
        
        // Display both choices
        System.out.println("You chose: " + player);
        System.out.println("Computer chose: " + computer);
        
        // Determine winner using nested if statements
        if (player.equals("rock")) {
            if (computer.equals("rock")) {
                System.out.println("It's a tie!");
            } else if (computer.equals("paper")) {
                System.out.println("Computer wins! Paper wraps rock.");
            } else {
                System.out.println("You win! Rock crushes scissors.");
            }
        }
        else if (player.equals("paper")) {
            if (computer.equals("rock")) {
                System.out.println("You win! Paper wraps rock.");
            } else if (computer.equals("paper")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Computer wins! Scissors cut paper.");
            }
        }
        else if (player.equals("scissors")) {
            if (computer.equals("rock")) {
                System.out.println("Computer wins! Rock crushes scissors.");
            } else if (computer.equals("paper")) {
                System.out.println("You win! Scissors cut paper.");
            } else {
                System.out.println("It's a tie!");
            }
        }
        else {
            System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
        }
        
        sc.close();
    }
}
    

