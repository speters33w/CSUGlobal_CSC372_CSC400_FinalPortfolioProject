package edu.csuglobal.csc400.portfolio_project;

import util.speters33w.sort.QuickSort;
import util.speters33w.sort.ReverseArray;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * This class is used to display a list of orders in sorted order.
 */
public class Display {

    /**
     * Order list sorted by order number (descending).
     */
    private Order[] ordersByOrderNumber;

    /**
     * Order list sorted by customer last name (descending).
     */
    private Order[] ordersByCustomerLastName;


    /**
     * Constructor for the display object.
     * This takes a LinkedList of orders as input,
     * sorts them by order number (descending) using QuickSort,
     * and sorts them by customer's last name (descending),
     * then populates the fields with the sorted orders.
     * It prints both sorted order lists to the console.
     *
     * @param orders a LinkedList of orders to be processed.
     */
    public Display(LinkedList<Order> orders) {
        this.ordersByOrderNumber = (orders.toArray(new Order[0]));
        orders.sort(Comparator.comparing(Order::getCustomerLastName));
        this.ordersByCustomerLastName = (orders.toArray(new Order[0]));
        ReverseArray.reverse(this.ordersByCustomerLastName);
        QuickSort.quickSort(this.ordersByOrderNumber);
        ReverseArray.reverse(this.ordersByOrderNumber);
        if (orders.size() > 1) {
            System.out.println("Orders by order number (descending):");
            for (Order order : ordersByOrderNumber) {
                System.out.println(order);
            }
            System.out.println();
            System.out.println("Orders by customer's last name (descending):");
            for (Order order : ordersByCustomerLastName) {
                System.out.println(order);
            }
            System.out.println();
        }
    }

    /**
     * Updater for the display object.
     * This takes a LinkedList of orders as input,
     * sorts them by order number (descending) using QuickSort,
     * and sorts them by customer's last name (descending),
     * then populates the fields with the sorted orders.
     * It prints both sorted order lists to the console.
     *
     * @param orders a LinkedList of orders to be processed.
     */
    public void setOrders(LinkedList<Order> orders) {
        this.ordersByOrderNumber = (orders.toArray(new Order[0]));
        orders.sort(Comparator.comparing(Order::getCustomerLastName));
        this.ordersByCustomerLastName = (orders.toArray(new Order[0]));
        ReverseArray.reverse(this.ordersByCustomerLastName);
        QuickSort.quickSort(this.ordersByOrderNumber);
        ReverseArray.reverse(this.ordersByOrderNumber);
        System.out.println("Orders by order number (descending):");
        for (Order order : ordersByOrderNumber) {
            System.out.println(order);
        }
        System.out.println();
        System.out.println("Orders by customer's last name (descending):");
        for (Order order : ordersByCustomerLastName) {
            System.out.println(order);
        }
        System.out.println();
    }
}
