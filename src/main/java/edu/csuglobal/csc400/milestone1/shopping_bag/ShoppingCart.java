/*
CSU Global CSC400 Module 2: Critical Thinking

Critical Thinking Assignment (60 Points)

Program 1 (On-Line Food Delivery Service)

Demonstrate an understanding of working with bags in Java 
    by implementing a class called ShoppingCart 
    that implements the BagInterfaceMyType in Java. 
Your implementation should include the following:

Fields:

    MyType[] myBag;
    int numberofProducts;
    Default_Capacity;

Methods:

    Constructor(): initialize bag
    add() - will be used to add a new entry.
    toArray() - provides an array of the allocated bag.
    isFull() - test whether the bag is at the maximum capacity.
*/

package edu.csuglobal.csc400.milestone1.shopping_bag;

import com.pearson.carrano.BagInterface;

public final class ShoppingCart<MyType> implements BagInterface<MyType> {

    /**
     * A bag of items.
     */
    private final MyType[] myBag;
    /**
     * The current number of items in the bag.
     */
    private int numberOfProducts = 0;
    /**
     * The capacity of the Shopping Cart.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Default constructor.
     * Creates a new shopping cart with a default capacity of 10.
     */
    public ShoppingCart() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor that accepts an initial capacity.
     * Creates a new shopping cart with the given initial capacity.
     *
     * @param desiredCapacity The initial capacity of the bag.
     */
    @SuppressWarnings("unchecked")
    public ShoppingCart(int desiredCapacity) {
        myBag = (MyType[]) new Object[desiredCapacity];
    }

    /**
     * Adds a new entry to this Shopping Cart.
     *
     * @param newEntry The object to be added as a new entry.
     * @return true if the addition is successful, or false if not.
     */
    public boolean add(MyType newEntry) {
        if (isFull()) {
            System.out.printf("Failed to add %s, Container is full.%n", newEntry.toString());
            return false;
        } else {
            System.out.printf("Added %s to the bag.%n", newEntry.toString());
            myBag[numberOfProducts] = newEntry;
            numberOfProducts += 1;
        }
        return true;
    }

    /**
     * Returns all Shopping Cart items as a new array.
     *
     * @return All Shopping Cart entries as an array.
     */
    @SuppressWarnings("unchecked")
    public MyType[] toArray() {
        MyType[] result = (MyType[]) new Object[numberOfProducts];
        System.arraycopy(myBag, 0, result, 0, numberOfProducts);
        return result;
    }

    /**
     * Checks if the Shopping Cart is full.
     *
     * @return true if the Shopping Cart is full, or false otherwise.
     */
    private boolean isFull() {
        return numberOfProducts >= myBag.length;
    }

    /**
     * Returns true if this Shopping Cart is empty.
     *
     * @return true if this Shopping Cart is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return numberOfProducts == 0;
    }

    /**
     * Returns the number of items in this Shopping Cart.
     *
     * @return The number of items in this Shopping Cart.
     */
    public int getCurrentSize() {
        return numberOfProducts;
    }

    /**
     * Count the number of times a given entry appears in this Shopping Cart.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times the item appears in this Shopping Cart.
     */
    public int getFrequencyOf(MyType anEntry) {
        int counter = 0;
        for (int index = 0; index < numberOfProducts; index++) {
            if (anEntry.equals(myBag[index])) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Finds if an item exists in this Shopping Cart.
     *
     * @param anEntry An item to locate.
     * @return true if the Shopping Cart contains the item, or false if not.
     */
    public boolean contains(MyType anEntry) {
        return getIndexOf(anEntry) > -1; // or >= 0
    }

    /**
     * Remove all entries from this bag.
     */
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    /**
     * Remove one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if removal was successful, or null.
     */
    public MyType remove() {
        return removeEntry(numberOfProducts - 1);
    }

    /**
     * Remove one occurrence of a given item from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return true if the removal was successful, or false if not.
     */
    public boolean remove(MyType anEntry) {
        System.out.printf("Removing %s from the bag.%n", anEntry.toString());
        return anEntry.equals(removeEntry(getIndexOf(anEntry)));
    }

    /**
     * Gets the index of the first occurrence of an item in this Shopping Cart.
     *
     * @param anEntry The item to locate.
     * @return The index of an item in this Shopping Cart, or -1 if not found.
     */
    private int getIndexOf(MyType anEntry) {
        for (int index = 0; index < numberOfProducts; index++) {
            if (anEntry.equals(myBag[index])) {
                return index;
            }
        }
        return -1;
    }


    /**
     * Removes a specified entry by index from this Shopping Cart.
     *
     * @param givenIndex the index of the item to remove.
     * @return the removed entry.
     */
    private MyType removeEntry(int givenIndex) {
        MyType result = null;
        if (givenIndex >= 0 && givenIndex < numberOfProducts) {
            result = myBag[givenIndex];
            myBag[givenIndex] = myBag[numberOfProducts - 1];
            myBag[numberOfProducts - 1] = null;
            numberOfProducts -= 1;
        }
        return result;
    }
}
