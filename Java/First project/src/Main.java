import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

import java.io.*;
import java.util.*;
import java.applet.Applet;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of available products
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new Product(1, "Laptop", 1200.50));
        availableProducts.add(new Product(2, "Smartphone", 800.00));
        availableProducts.add(new Product(3, "Headphones", 150.00));
        availableProducts.add(new Product(4, "Smartwatch", 200.00));

        // Display available products
        System.out.println("Welcome to the Online Store!");
        System.out.println("Available Products:");
        for (Product product : availableProducts) {
            System.out.println(product.getProductID() + ". " + product.getName() + " - $" + product.getPrice());
        }

        // Create a customer
        Customer customer = new Customer(101, "Alice");

        // Allow the customer to browse and add products to their shopping cart
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;
        while (shopping) {
            System.out.println("\nEnter the product ID to add to your cart (or 0 to finish shopping): ");
            int productID = scanner.nextInt();

            if (productID == 0) {
                shopping = false;
            } else {
                boolean productFound = false;
                for (Product product : availableProducts) {
                    if (product.getProductID() == productID) {
                        customer.addProductToCart(product);
                        productFound = true;
                        break;
                    }
                }
                if (!productFound) {
                    System.out.println("Invalid product ID. Please try again.");
                }
            }
        }

        // Display the contents of the customer's shopping cart
        System.out.println("\nShopping Cart:");
        for (Product product : customer.getShoppingCart()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }

        // Place an order
        System.out.println("\nPlacing your order...");
        Order order = new Order(1001, customer, customer.getShoppingCart());
        System.out.println(order.generateOrderSummary());

        // Update the order status and display it
        order.updateOrderStatus("Processing");

        // Display final order information
        System.out.println("\nFinal Order Details:");
        System.out.println(order.generateOrderSummary());

        // End program
        System.out.println("Thank you for shopping with us!");
        scanner.close();
    }


    public void uploadImage(File source, File destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }

    public void streamVideo(File videoFile, OutputStream outputStream) throws IOException {
        try (FileInputStream fis = new FileInputStream(videoFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(outputStream)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }



   import java.applet.Applet;
import java.awt.*;
import java.util.*;

    public class SalesChartApplet extends Applet {
        private Map<String, Integer> salesData = new HashMap<>();

        @Override
        public void init() {
            salesData.put("Product A", 150);
            salesData.put("Product B", 100);
            salesData.put("Product C", 200);
        }

        @Override
        public void paint(Graphics g) {
            int x = 50;
            for (Map.Entry<String, Integer> entry : salesData.entrySet()) {
                g.drawString(entry.getKey(), x, 150 - entry.getValue());
                g.fillRect(x, 150 - entry.getValue(), 20, entry.getValue());
                x += 40;
            }
        }
    }



}
