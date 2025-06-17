package org.skypro.skyshop;

import org.skypro.skyshop.article.SearchEngine;
import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        SearchEngine searchEngine = new SearchEngine();
        ProductBasket basket = new ProductBasket();

        basket.addProduct(new Product("Помидор", 259));
        basket.addProduct(new Product("Огурцы", 150));
        searchEngine.addProduct(new Product("Макароны", 200));
        searchEngine.addProduct(new Product("Сыр", 239));
        basket.addProduct(new Product("Молоко", 96));
        basket.addProduct(new Product("Хлеб", 54));

        Map<String, Searchable> searchResults = searchEngine.search("Макароны");
        for (Map.Entry<String, Searchable> entry : searchResults.entrySet()) {
            System.out.println("Product Name: " + entry.getKey() + ", Product Details: " + entry.getValue());
        }

        List<Product> removedProducts = basket.removeProductsByName("Помидор");
        System.out.println("Удаленные продукты: " + removedProducts);

        basket.printBasket();

        removedProducts = basket.removeProductsByName("Макароны");
        if (removedProducts.isEmpty()) {
            System.out.println("Список пуст");
        }
        basket.printBasket();
    }
}
