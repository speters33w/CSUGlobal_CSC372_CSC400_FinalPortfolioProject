/*
CSU Global CSC400 Module 8: Portfolio Project

Portfolio Project (300 Points)

Order List Handler for an Online Retailer

Create a Display Class that will store a copy of the order queue in two arrays.
Each array will contain the order list but
    one will be sorted by name and the other sorted by order number.
When an order is taken and stored in the Order Class the program will
    update the Display Class arrays automatically and
    sort them in descending order using quick sort and
    output the contents to the console upon each entry of new data.
*/
package edu.csuglobal.csc400.portfolio_project;

import util.speters33w.sort.QuickSort;

import java.util.Arrays;
import java.util.Collections;
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
        Collections.reverse(Arrays.asList(this.ordersByCustomerLastName));
        QuickSort.quickSort(this.ordersByOrderNumber);
        Collections.reverse(Arrays.asList(this.ordersByOrderNumber));
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
        Collections.reverse(Arrays.asList(this.ordersByCustomerLastName));
        QuickSort.quickSort(this.ordersByOrderNumber);
        Collections.reverse(Arrays.asList(this.ordersByOrderNumber));
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
