package edu.csuglobal.csc400.portfolio_project;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * This class represents a single order.
 */
public class Order extends LinkedList<Order> implements Comparable<Order> {

    /**
     * The customer's last name
     */
    private final String customerLastName;
    /**
     * The order number
     */
    private final Long orderNumber;
    /**
     * The order total
     */
    private final BigDecimal orderTotal;

    /**
     * Creates an order with the specified customer's last name, order number, and order total.
     *
     * @param customerLastName the customer's last name.
     * @param orderNumber      the order number.
     * @param orderTotal       the order total.
     */
    public Order(String customerLastName, long orderNumber, BigDecimal orderTotal) {
        this.customerLastName = customerLastName;
        this.orderNumber = orderNumber;
        this.orderTotal = orderTotal;
    }

    /**
     * Returns the customer's last name.
     *
     * @return the customer's last name.
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Returns the order number.
     *
     * @return the order number.
     */
    public long getOrderNumber() {
        return orderNumber;
    }

    /**
     * Returns the order total.
     *
     * @return the order total.
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Compares this order with the specified order for sorting.
     * Returns a negative integer, zero, or a positive integer
     * if this order number is less than, equal to, or greater than the specified object.
     *
     * @param order the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object.
     */
    @Override
    public int compareTo(Order order) {
//        return super.toString().compareTo(order.toString());
        return this.orderNumber.compareTo(order.orderNumber);
    }

    public String toString() {
        return String.format("%-10s %-10s $%-6s", customerLastName, orderNumber, orderTotal);
    }

    /**
     * Performs the given action for each element of the {@code Iterable}
     * until all elements have been processed or the action throws an
     * exception.  Actions are performed in the order of iteration, if that
     * order is specified.  Exceptions thrown by the action are relayed to the
     * caller.
     *
     * @param action The action to be performed for each element
     */
    @Override
    public void forEach(Consumer<? super Order> action) {
        super.forEach(action);
    }
}
