package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class SearchEngine extends Article {

    private Map<String, List<Product>> products;

    public SearchEngine() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        String name = product.getName();
        products.putIfAbsent(name, new ArrayList<>());
        products.get(name).add(product);
    }

    public Map<String, Searchable> search(String query) {
        Map<String, Searchable> results = new TreeMap<>();

        if (products.containsKey(query)) {
            for (Product product : products.get(query)) {
                results.put(product.getName(), product);
            }
        }
        return results;
    }

    public void printAllProducts() {
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                System.out.println(product);

            }
        }
    }
}
