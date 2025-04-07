package Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new ElectronicsProduct("Smartphone", 699.99, "Samsung", 24));
        cart.add(new ClothingProduct("T-Shirt", 19.99, "M", "Black"));
        

        double total = 0.0;

        System.out.println("Shopping Cart Details:");
        for (Product product : cart) {
            System.out.println(product.getDescription() + " - Price: $" + product.getPrice());
            total += product.getPrice();
        }

        System.out.printf("Total Price: $%.2f\n", total);
    }
}
