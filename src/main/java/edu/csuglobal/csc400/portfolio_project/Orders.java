package edu.csuglobal.csc400.portfolio_project;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class maintains a Queue of Orders.
 *
 * @param <Order> The Order object type.
 * @see edu.csuglobal.csc400.portfolio_project.Order
 */
public class Orders<Order extends LinkedList<? super Order>> {

    /**
     * The Queue of Orders.
     */
    private final Queue<Order> orders = new LinkedList<>();

    /**
     * Constructor. Creates the Queue of Orders.
     */
    public Orders() {
        super();
    }

    /**
     * Returns the Queue of Orders as an Orders&lt;Order&gt; object.
     *
     * @return The Queue of Orders as an Orders&lt;Order&gt; object.
     */
    public Orders<Order> getOrders() {
        Orders<Order> returnOrders = new Orders<>();
        for (Order order : orders) {
            returnOrders.add(order);
        }
        return returnOrders;
    }

    /**
     * Returns the Queue of Orders as a LinkedList&lt;Order&gt; object.
     *
     * @return The Queue of Orders as a LinkedList&lt;Order&gt; object.
     */
    public LinkedList<Order> getOrdersAsList() {
        return new LinkedList<>(orders);
    }

    /**
     * Adds an Order to the Queue of Orders.
     *
     * @param order the order to be added to the Queue of Orders.
     */
    public void add(Order order) {
        orders.add(order);
    }

    /**
     * Removes an Order from the Queue of Orders.
     *
     * @param order the order to be removed from the Queue of Orders.
     */
    public void remove(Order order) {
        orders.remove(order);
    }

    /**
     * Returns the number of Orders in the Queue of Orders.
     *
     * @return the number of Orders in the Queue of Orders.
     */
    public int size() {
        return orders.size();
    }
}
