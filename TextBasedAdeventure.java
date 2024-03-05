import java.util.Scanner;

public class TextBasedAdeventure {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest...");

        System.out.println("1. Follow the path deeper into the forest.");
        System.out.println("2. Climb a tree to get a better view.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            forestPath();
        } else {
            climbTree();
        }

        scanner.close();
    }

    public static void forestPath() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("As you walk along the path, you encounter a magical creature.");
        System.out.println("It offers you a choice:");

        System.out.println("1. Accept the creature's offer.");
        System.out.println("2. Politely decline and continue on your way.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            acceptOffer();
        } else {
            continueOnPath();
        }

        scanner.close();
    }

    public static void climbTree() {
        System.out.println("You climb the tree and spot a hidden cave in the distance.");

        System.out.println("1. Investigate the cave.");
        System.out.println("2. Descend from the tree and follow the path.");

        Scanner scanner = new Scanner(System.in);
        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            investigateCave();
        } else {
            continueOnPath();
        }

        scanner.close();
    }

    public static void acceptOffer() {
        System.out.println("The magical creature grants you a special ability.");

        
        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

    public static void continueOnPath() {
        System.out.println("You continue on the path and discover a hidden treasure!");

        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

    public static void investigateCave() {
        System.out.println("You enter the cave and find a sleeping dragon.");

        System.out.println("1. Try to sneak past the dragon.");
        System.out.println("2. Wake up the dragon and attempt to befriend it.");

        Scanner scanner = new Scanner(System.in);
        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            sneakPastDragon();
        } else {
            befriendDragon();
        }

        scanner.close();
    }

    public static void sneakPastDragon() {
        System.out.println("You successfully sneak past the dragon and find a hidden exit.");

        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

    public static void befriendDragon() {
        System.out.println("The dragon is friendly and allows you to ride on its back.");

        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > maxChoice);
        return choice;
    }
}
