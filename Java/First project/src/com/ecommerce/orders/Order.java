package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;
    private String orderStatus;

    // Constructor
    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = calculateOrderTotal();
        this.orderStatus = "Pending";  // Default status when an order is created
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        this.orderTotal = calculateOrderTotal();  // Update total when products change
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // Methods

    /**
     * Calculate the total cost of the order.
     * @return The total cost.
     */
    private double calculateOrderTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * Generate a summary of the order, including customer details, products, and total cost.
     */
    public String generateOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(orderID).append("\n");
        summary.append("Customer: ").append(customer.getName()).append(" (ID: ").append(customer.getCustomerID()).append(")\n");
        summary.append("Products:\n");

        for (Product product : products) {
            summary.append(" - ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }

        summary.append("Order Total: $").append(orderTotal).append("\n");
        summary.append("Order Status: ").append(orderStatus).append("\n");
        return summary.toString();
    }

    /**
     * Update the status of the order.
     * @param newStatus The new status to set (e.g., "Processing", "Shipped", "Delivered").
     */
    public void updateOrderStatus(String newStatus) {
        this.orderStatus = newStatus;
        System.out.println("Order status updated to: " + newStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customer=" + customer.getName() +
                ", orderTotal=" + orderTotal +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
