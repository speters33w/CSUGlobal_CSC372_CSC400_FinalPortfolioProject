package discussion;

import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class TunnelWithDescriptions {


    private static final char MOVE_FORWARD = 'F';
    private static final char MOVE_BACKWARD = 'B';
    private static final char QUIT = 'Q';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int moves = 0;
        char response = ' ';
        boolean quit = false;
        Stack<Integer> backStack = new Stack<>();
        Stack<Integer> forwardStack = new Stack<>();
        Random random = new Random();
        System.out.println("Welcome to the stacks! You may go [F]orward, [B]ack, or [Q]uit.");

        while (!quit) {
            moves++;
            response = scanner.nextLine().toUpperCase().charAt(0);

            switch (response) {
                case MOVE_FORWARD:
                    forwardStack.push(counter);
                    System.out.printf("location %d.%n", forwardStack.peek());
                    describe(forwardStack.peek(), true);
                    counter++;
                    System.out.println(forwardStack.peek());
                    System.out.println(!forwardStack.isEmpty());
                    break;
                case MOVE_BACKWARD:
                    if (!forwardStack.isEmpty()) {
                        int currentLocation = forwardStack.pop();
                        backStack.push(currentLocation);
                        counter--;
                        if (!forwardStack.isEmpty()) {
                            System.out.printf("location %d (from %d).%n", forwardStack.peek(), backStack.peek());
                            describe(forwardStack.peek(), false);
                        } else {
                            System.out.printf("You are at location %d.%n", counter);
                            describe(counter, false);
                        }
                    } else {
                        System.out.println("You must go forward to go back!");
                    }
                    break;
                case QUIT:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please choose either [F]orward, [B]ack, or [Q]uit.");
                    break;
            }

            // If user doesn't quit, introduce a random exit after 10 moves
            if (counter != 1) {
                if (random.nextInt(10) == 0) {
                    System.out.println("An unexpected exit! You found your way out of the tunnel!");
                    quit = true;
                //if user has spent 40 moves in the tunnel, end it already!
                } else if (moves >= 40) {
                    System.out.println("You traveled a great distance in the tunnel but couldn't find the exit!");
                }

            }
        }
        if (response == 'Q') {
            System.out.printf(
                    "You traveled a great distance in the tunnel! \n" +
                    "You found an exit at location %d.%n", counter);
        }
    }

        public static void describe ( int location, boolean longDescription){
            switch (location) {
                case 1:
                    if (longDescription) {
                        System.out.println(
                                "You find yourself alone in a dark tunnel. \nWater trickles beneath your feet. \n" +
                                "How you got here, you don't know. \n" +
                                "Is this a dream? You must go somewhere to get out of this tunnel!\n");
                    } else {
                        System.out.println("Alone in a dark tunnel.");
                    }
                    break;
                case 2:
                    if (longDescription) {
                        System.out.println(
                                "You are in a sort of vault. \nGraffiti covers the walls. \n" +
                                "One particular piece of graffiti catches your interest. \n" +
                                "In a stylized scrawl, it declares: XYZZY.\n");
                    } else {
                        System.out.println("Alone in a dark vault.");
                    }
                    break;
                case 3:
                    if (longDescription) {
                        System.out.println(
                                "It is getting darker. \nIt's a good thing you have a handy torch in your hand!\n" +
                                "The tunnel (and the water) continues down. \n" +
                                "At the far exit there is a gate where you can read the following words:\n" +
                                "\"Lasciate ogne speranza, voi ch'intrate\"\n");
                    } else {
                        System.out.println("Alone at the gate.");
                    }
                    break;
                default:
                    if (longDescription) {
                        System.out.printf("You are at location %d.%n", location); // todo for more locations
                    } else {
                        System.out.printf("Location %d.%n", location); // todo
                    }
                    break;
            }
        }
    }

