/*
CSU Global CSC400 Module 2: Critical Thinking

Critical Thinking Assignment (60 Points)

Program 1 (On-Line Food Delivery Service)

Implement a BagDemo that tests your bag implementation class.

Methods:

    testAddl() - will add the contents to the Bag.
    displayBag() - will display the contents of the Bag.
*/

package edu.csuglobal.csc400.milestone1.shopping_bag;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Tests all methods in ShoppingCart.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public final class TestShoppingCart {
    private TestShoppingCart() {} //Utility class should not be instantiated.

    /**
     * Main method to test the ShoppingCart functionality.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
//        BigDecimal total = new BigDecimal(0);


        Item loafOfBread = new Item("Loaf of Bread", new BigDecimal("3.42"));
        Item containerOfMilk = new Item("Container of Milk", new BigDecimal("3.92"));
        Item stickOfButter = new Item("Stick of Butter", new BigDecimal("3.98"));

        ShoppingCart<Item> shoppingCart = new ShoppingCart<>();
        System.out.println("Shopping Cart is empty? " + shoppingCart.isEmpty());
        testAddl(shoppingCart, loafOfBread);
        System.out.println("Shopping Cart is empty? " + shoppingCart.isEmpty());
        testAddl(shoppingCart, containerOfMilk);
        System.out.println("shoppingCart contains Stick of Butter? = " + shoppingCart.contains(stickOfButter));
        testAddl(shoppingCart, stickOfButter);
        System.out.println("shoppingCart contains Stick of Butter? = " + shoppingCart.contains(stickOfButter));
        testAddl(shoppingCart, loafOfBread);
        testAddl(shoppingCart, containerOfMilk);
        testAddl(shoppingCart, stickOfButter);
        testAddl(shoppingCart, loafOfBread);
        testAddl(shoppingCart, containerOfMilk);
        testAddl(shoppingCart, stickOfButter);
        testAddl(shoppingCart, loafOfBread);
        displayBag(shoppingCart);
        System.out.println("shoppingCartSize = " + shoppingCart.getCurrentSize());
        testAddl(shoppingCart, containerOfMilk);
        displayBag(shoppingCart);
        System.out.println("shoppingCartSize = " + shoppingCart.getCurrentSize());
        System.out.println("shoppingCartFrequency of Stick of Butter = " + shoppingCart.getFrequencyOf(stickOfButter));
        System.out.println("shoppingCartFrequency of Loaf of Bread = " + shoppingCart.getFrequencyOf(loafOfBread));
        System.out.println("Testing remove an item unparameterized. " + shoppingCart.remove());
        System.out.println("shoppingCartFrequency of Loaf of Bread = " + shoppingCart.getFrequencyOf(loafOfBread));
        testAddl(shoppingCart, loafOfBread);
        System.out.println("shoppingCartFrequency of Loaf of Bread = " + shoppingCart.getFrequencyOf(loafOfBread));
        System.out.println("shoppingCartSize = " + shoppingCart.getCurrentSize());
        shoppingCart.remove(stickOfButter);
        System.out.println("shoppingCartSize = " + shoppingCart.getCurrentSize());
        System.out.println("shoppingCartFrequency of Stick of Butter = " + shoppingCart.getFrequencyOf(stickOfButter));
        System.out.println("Clearing Shopping Cart. ");
        shoppingCart.clear();
        System.out.println("shoppingCartSize = " + shoppingCart.getCurrentSize());
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
