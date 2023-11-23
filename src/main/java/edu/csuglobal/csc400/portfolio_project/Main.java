package edu.csuglobal.csc400.portfolio_project;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    /**
     * Main runner method for the program.
     * This method seeds the order list with dummy orders,
     * then presents the user with a menu of options.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Orders<Order> orders = new Orders<>();
        Display display = new Display(orders.getOrdersAsList());
        Scanner scanner = new Scanner(System.in);

        // Seed orders list with dummy orders
        addCompletedOrder(orders, display, "Johnson", 123, new BigDecimal("45.67"));
        addCompletedOrder(orders, display, "Smith", 890, new BigDecimal("23.45"));
        addCompletedOrder(orders, display, "Adams", 456, new BigDecimal("56.78"));

        userMenu(orders, display, scanner);

        scanner.close();
    }

    /**
     * The main menu for user interface with the program.
     *
     * @param orders  An Orders&lt;Order&gt; list of orders.
     * @param display A display object that contains sorted order lists concurrently with orders.
     * @param scanner A Scanner object for user input.
     */
    public static void userMenu(Orders<Order> orders, Display display, Scanner scanner) {
        while (true) {
            System.out.println("""
                               ***** MAIN MENU *****
                               [A]dd an order
                               [R]emove an order
                               [D]isplay order list from the queue
                               [Q]uit
                               """);
            char choice = scanner.nextLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A' -> addOrder(orders, display, scanner);
                case 'R' -> removeOrder(orders, display, scanner);
                case 'D' -> {
                    System.out.println("Orders in queue:");
                    for (Order order : orders.getOrdersAsList()) {
                        System.out.println(order);
                    }
                    System.out.println();
                }
                case 'Q' -> System.exit(0);
                default -> System.out.println("Please try again.\n");
            }
        }
    }

    /**
     * Adds a new order to the order list,
     * displays the new order list to the user,
     * then returns to the main menu.
     *
     * @param orders  An Orders&lt;Order&gt; list of orders to be updated.
     * @param display A display object that contains sorted order lists concurrently with orders.
     * @param scanner A Scanner object for user input.
     */
    public static void addOrder(Orders<Order> orders, Display display, Scanner scanner) {
        System.out.println("Enter the customer's last name: ");
        String customerLastName = scanner.nextLine();
        String orderNumberString = "-1";
        long orderNumber = -1;
        while (!orderNumberString.matches("\\d+") && orderNumberString.toUpperCase().charAt(0) != 'X') {
            System.out.println("Enter the order number (X exits without entering an order): ");
            orderNumberString = scanner.nextLine().strip();
            if (orderNumberString.matches("\\d+")) {
                orderNumber = Long.parseLong(orderNumberString);
            }
        }
        String orderTotalString = "-1";
        BigDecimal orderTotal = new BigDecimal("-1");
        while (!orderTotalString.matches("[0-9]+\\.[0-9]+") && orderTotalString.toUpperCase().charAt(0) != 'X') {
            System.out.println("Enter order total (X exits without entering an order): ");
            orderTotalString = scanner.nextLine().strip();
            if (orderTotalString.matches("[0-9]+\\.[0-9]+")) {
                orderTotal = new BigDecimal(orderTotalString);
            }
        }
        if (orderNumberString.toUpperCase().charAt(0) != 'X' && orderTotalString.toUpperCase().charAt(0) != 'X') {
            orders.add(new Order(customerLastName, orderNumber, orderTotal));
        }
        display.setOrders(orders.getOrdersAsList());
        userMenu(orders, display, scanner);
    }

    /**
     * A method that adds orders to the order list without manual user entry.
     *
     * @param orders      An Orders&lt;Order&gt; list of orders to be updated.
     * @param display     A display object that contains sorted order lists concurrently with orders.
     * @param name        the customer's last name for the new order.
     * @param orderNumber the order number for the new order.
     * @param orderTotal  the order total for the new order.
     */
    public static void addCompletedOrder(Orders<Order> orders, Display display, String name, long orderNumber, BigDecimal orderTotal) {
        orders.add(new Order(name, orderNumber, orderTotal));
        display.setOrders(orders.getOrdersAsList());
    }

    /**
     * Removes an order to the order list,
     * displays the new order list with the order removed to the user,
     * then returns to the main menu.
     *
     * @param orders  An Orders&lt;Order&gt; list of orders to be updated.
     * @param display A display object that contains sorted order lists concurrently with orders.
     * @param scanner A Scanner object for user input.
     */
    public static void removeOrder(Orders<Order> orders, Display display, Scanner scanner) {
        String orderNumberString = "-1";
        while (!orderNumberString.matches("\\d+") && orderNumberString.toUpperCase().charAt(0) != 'X') {
            System.out.println("Enter the order number to be removed (X exits without removing an order): ");
            orderNumberString = scanner.nextLine().strip();
            if (orderNumberString.matches("\\d+")) {
                for (Order order : orders.getOrdersAsList()) {
                    if (order.getOrderNumber() == Long.parseLong(orderNumberString)) {
                        orders.remove(order);
                    }
                }
            }
        }
        display.setOrders(orders.getOrdersAsList());
        userMenu(orders, display, scanner);
    }
}
