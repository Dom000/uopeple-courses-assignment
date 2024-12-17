package Arrays_Arraylists;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Unit4_assignment {
    // Method to calculate the average stock price
    private static double calculateAverageStockPrice(double[] stockPrices) {
        double sum = 0;
        for (double price : stockPrices) {
            sum += price;
        }
        double result;
        result = sum / stockPrices.length;
        return result;
    }

    // Method to find the maximum stock price
    private static double findMaximumPrice(double[] stockPrices) {
        double maxPrice = stockPrices[0];
        for (double price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price
    private static int countOccurrences(double[] stockPrices, double targetPrice) {
        int count = 0;
        for (double price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }

        return count;
    }

    // Method to compute the cumulative sum of stock prices
    private static ArrayList<Double> computeCumulativeSum(ArrayList<Double> stockPrices) {
        ArrayList<Double> cumulativeSumList = new ArrayList<>();
        double cumulativeSum = 0;
        for (double price : stockPrices) {
            cumulativeSum += price;
            cumulativeSumList.add(cumulativeSum);
        }
        return cumulativeSumList;
    }

    public static void main(String[] args) {
        // Sample data
        double[] stockPricesArray = {100.5, 102.0, 101.5, 105.0, 99.0,99, 98, 97.0, 100.0, 101.0, 102.5};
        ArrayList<Double> stockPricesList = new ArrayList<>();
        for (double price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate average price
        double averagePrice = calculateAverageStockPrice(stockPricesArray);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find maximum price
        double maxPrice = findMaximumPrice(stockPricesArray);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Count occurrences of a specific price
        double targetPrice = 101.0f;
        int occurrences = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrences);

        // Compute cumulative sum of stock prices
        ArrayList<Double> cumulativeSumList = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSumList);
    }
}




//public class FinallyExample {
//    public static void main(String[] args) {
//        BufferedReader reader = null;
//        try {
//            // Attempt to open and read the file
//            reader = new BufferedReader(new FileReader("example.txt"));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // Handle any IO exceptions
//            System.out.println("An error occurred: " + e.getMessage());
//        } finally {
//            // Ensure the file is closed
//            try {
//                if (reader != null) {
//                    reader.close();
//                    System.out.println("File successfully closed.");
//                }
//            } catch (IOException e) {
//                System.out.println("Failed to close the file: " + e.getMessage());
//            }
//        }
//    }
//}
