public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 120.50),
            new Order(2, "Bob", 230.00),
            new Order(3, "Charlie", 150.75),
            new Order(4, "Diana", 80.00),
            new Order(5, "Eve", 190.25)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
