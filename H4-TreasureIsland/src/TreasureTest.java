import java.util.Scanner;

public class TreasureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("Welcome to the Mysterious Island. Your quest is to find the hidden treasure.");
        System.out.println("You are at a crossroads. Will you go left or right?");
        choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You've decided to go left.");
            System.out.println("As you arrive at a river, you face a choice. Will you swim across or patiently wait?");
            choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("swim")) {
                System.out.println("You jump into the river but are attacked by aggressive trout. Your journey ends here. Game Over.");
            } else if (choice.equalsIgnoreCase("wait")) {
                System.out.println("You wait by the river, and surprisingly, a magical boat appears. It takes you safely to the other side.");
                
                System.out.println("Continuing your journey, you encounter a huge Maze which has 4 interesting doors.");
                System.out.println("Which door do you choose? (Red/Blue/Yellow/Green)");
                choice = scanner.nextLine();
                
                if (choice.equalsIgnoreCase("red")) {
                    System.out.println("You brave the fire, but you get burned. Game Over.");
                } else if (choice.equalsIgnoreCase("blue")) {
                    System.out.println("You enter the blue door and face fierce creatures. Game Over.");
                } else if (choice.equalsIgnoreCase("yellow")) {
                    System.out.println("Congratulations! You win! The treasure is yours!");
                } else if (choice.equalsIgnoreCase("green")) {
                    System.out.println("Stepping through the green door, you find yourself in a lush, magical forest. But you don't find the treasure. Game Over.");
                } else {
                    System.out.println("Invalid choice.");
                }
                
            } else {
                System.out.println("Invalid choice. Game Over.");
            }
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You chose the right path but fell into a hidden pit. Game Over.");
        } else {
            System.out.println("Your hesitation leads to an unfortunate end. Game Over.");
        }
    }
}
