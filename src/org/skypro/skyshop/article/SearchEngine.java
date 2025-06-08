package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Product;
import java.util.ArrayList;
import java.util.List;

public class SearchEngine extends Article {

    private List<Product> products;


    public SearchEngine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> search(String query) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(query)) {
                results.add(product);
            }
        }
        return results;

    }

}
