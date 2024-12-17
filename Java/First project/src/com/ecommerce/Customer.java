package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;  // Shopping cart to store products

    // Constructor
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Methods for shopping cart operations

    /**
     * Add a product to the shopping cart.
     * @param product The product to be added.
     */
    public void addProductToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }

    /**
     * Remove a product from the shopping cart.
     * @param productID The ID of the product to be removed.
     */
    public void removeProductFromCart(int productID) {
        shoppingCart.removeIf(product -> product.getProductID() == productID);
        System.out.println("Product with ID " + productID + " has been removed from your cart.");
    }

    /**
     * Calculate the total cost of the products in the shopping cart.
     * @return The total cost.
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : shoppingCart) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    /**
     * Place an order by displaying the total cost and clearing the cart.
     */
    public void placeOrder() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Your cart is empty. Add products before placing an order.");
        } else {
            double totalCost = calculateTotalCost();
            System.out.println("Order placed successfully! Total cost: $" + totalCost);
            shoppingCart.clear();  // Clear the cart after placing the order
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
