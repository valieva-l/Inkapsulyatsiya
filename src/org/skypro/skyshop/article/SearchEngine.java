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

    public List<Product> removeProductsByName(String name) {
        List<Product> removedProducts = new ArrayList<>();

        for (Map.Entry<String, List<Product>> entry : products.entrySet()) {
            Iterator<Product> iterator = entry.getValue().iterator();

            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getName().equals(name)) {
                    removedProducts.add(product);
                    iterator.remove();
                }
            }
        }
        return removedProducts;
    }

    public void printAllProducts() {
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                System.out.println(product);

            }
        }
    }
}
