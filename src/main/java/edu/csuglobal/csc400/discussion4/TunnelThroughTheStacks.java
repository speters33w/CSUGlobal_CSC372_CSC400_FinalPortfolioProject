package discussion;

import java.util.Scanner;
import java.util.Stack;

public class TunnelThroughTheStacks {
    public static void main(String[] args) {
        System.out.println("You find yourself alone in a dark tunnel. \nWater trickles beneath your feet. \n" +
                           "How you got here, you don't know. \n" +
                           "Is this a dream? You must go somewhere to get out of this tunnel!\n");
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        char response = ' ';
        boolean quit = false;
        Stack<Integer> backStack = new Stack<>();
        Stack<Integer> forwardStack = new Stack<>();
        while (!quit) {
            System.out.println("Welcome to the stacks! You may go [F]orward, [B]ack, or [Q]uit.");
            try {
                response = scanner.nextLine().toUpperCase().charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Such empty!");
            }
            switch (response) {
                case 'F':
                    forwardStack.push(counter);
                    System.out.printf("You are at location %d.%n", forwardStack.peek());
                    counter++;
                    break;
                case 'B':
                    if (!forwardStack.isEmpty()) {
                        backStack.push(forwardStack.peek());
                        if (!forwardStack.peek().equals(1)) {
                            forwardStack.pop();
                            System.out.printf("You are at location %d.%n", forwardStack.peek());
                            System.out.printf("Your last location was %d.%n", backStack.peek());
                            counter--;
                        } else {
                            counter--;
                            System.out.printf("You are at location %d.%n", counter);
                        }
                    } else {
                        System.out.println("You must go forward to go back!");
                        System.out.printf("You are at location %d.%n", 0);
                    }
                    break;
                case 'Q':
                    quit = true;
                    break;
                default:
                    System.out.println("You cannot go that direction!");
                    break;
            }
        }
        System.out.printf("You traveled a great distance in the tunnel! \n" +
                          "You found an exit at location %d.%n", counter);
        scanner.close();
    }
}
