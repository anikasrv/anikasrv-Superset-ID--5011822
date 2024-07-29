import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Method to update a product
    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        Product removedProduct = inventory.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    // Method to display the inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        // Add some products
        ims.addProduct(new Product("P001", "Laptop", 10, 999.99));
        ims.addProduct(new Product("P002", "Smartphone", 20, 499.99));
        
        // Display inventory
        ims.displayInventory();
        
        // Update a product
        ims.updateProduct("P001", 15, 899.99);
        
        // Display inventory
        ims.displayInventory();
        
        // Delete a product
        ims.deleteProduct("P002");
        
        // Display inventory
        ims.displayInventory();
    }
}
