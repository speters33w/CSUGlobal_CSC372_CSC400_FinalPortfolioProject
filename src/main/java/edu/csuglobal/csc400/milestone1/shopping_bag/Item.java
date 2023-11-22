package edu.csuglobal.csc400.milestone1.shopping_bag;

import java.math.BigDecimal;

/**
 * An Item that represents a product.
 */
public class Item {
    private final String description;
    private final BigDecimal price;

    /**
     * Constructor.
     * Creates a new Item with the given description and price.
     *
     * @param productDescription the product description.
     * @param productPrice       the product price.
     */
    public Item(String productDescription, BigDecimal productPrice) {
        description = productDescription;
        price = productPrice;
    }

    /**
     * Gets the description of an item.
     *
     * @return the description of the item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price of an item.
     *
     * @return the price of the item as a String.
     */
    public String getPrice() {
        return price.toString();
    }

    /**
     * Returns a string representation of this item.
     *
     * @return a string representation of this item.
     */
    public String toString() {
        return String.format("%s\t$%s", description, price.toString());
    }
}
