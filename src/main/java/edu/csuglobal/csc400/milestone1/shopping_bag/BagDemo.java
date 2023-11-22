package edu.csuglobal.csc400.milestone1.shopping_bag;

import java.math.BigDecimal;
import java.util.Arrays;


@SuppressWarnings({"rawtypes", "unchecked"})
public final class BagDemo {
    private BagDemo() {} //Utility class should not be instantiated.

    /**
     * Main method to test the ShoppingCart.add() and ShoppingCart.toArray() methods.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
//        BigDecimal total = new BigDecimal(0);
        ShoppingCart<Item> shoppingCart = new ShoppingCart<>(3);

        Item loafOfBread = new Item("Loaf of Bread", new BigDecimal("3.42"));
        Item containerOfMilk = new Item("Container of Milk", new BigDecimal("3.92"));
        Item stickOfButter = new Item("Stick of Butter", new BigDecimal("3.98"));

        testAddl(shoppingCart, loafOfBread);
        displayBag(shoppingCart);
        testAddl(shoppingCart, containerOfMilk);
        displayBag(shoppingCart);
        testAddl(shoppingCart, stickOfButter);
        displayBag(shoppingCart);
        testAddl(shoppingCart, loafOfBread);
        displayBag(shoppingCart);
    }

    /**
     * Tests the ShoppingCart.add() method.
     *
     * @param shoppingCart The shopping cart to add to.
     * @param item The item to add to the shopping cart.
     */
    static void testAddl(ShoppingCart shoppingCart, Item item) {
        shoppingCart.add(item);
    }

    /**
     * Tests the ShoppingCart.toArray() method.
     *
     * @param shoppingCart The shopping cart to display to the console.
     */
    static void displayBag(ShoppingCart shoppingCart) {
        System.out.println(Arrays.toString(shoppingCart.toArray()));
    }
}
