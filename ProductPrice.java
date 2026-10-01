import java.util.HashMap;
import java.util.TreeMap;

public class ProductPrice {
    public static void main(String[] args) {

               HashMap<Integer, Double> products = new HashMap<>();

        products.put(103, 500.0);
        products.put(101, 250.0);
        products.put(105, 750.0);
        products.put(102, 300.0);

        System.out.println("Products:");
        System.out.println(products);

              int searchId = 103;

        if (products.containsKey(searchId)) {
            System.out.println("\nProduct " + searchId +
                    " found. Price = " + products.get(searchId));
        } else {
            System.out.println("\nProduct not found.");
        }

        
        products.put(103, 550.0);

        System.out.println("\nUpdated price of Product 103 = "
                + products.get(103));

               TreeMap<Integer, Double> sortedProducts =
                new TreeMap<>(products);

        System.out.println("\nProducts in sorted order:");
        for (Integer id : sortedProducts.keySet()) {
            System.out.println("Product ID: " + id +
                    " Price: " + sortedProducts.get(id));
        }
    }
}