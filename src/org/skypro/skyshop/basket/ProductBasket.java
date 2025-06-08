package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalCost() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getProductСost();
            }
        }
        return total;
    }

    public void printContents() {
        boolean empty = true;
        for (Product p : products) {
            if (p != null) {
                System.out.println(p.getProductName() + ": " + p.getProductСost());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalCost());
        }
    }

    public boolean containsProduct(Product product) {
        for (Product p : products) {
            if (p != null && p.equals(product)) {
                return true;
            }
        }
        return false;
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removedProducts = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                removedProducts.add(product);
                iterator.remove();
            }
        }
        return removedProducts;
    }

    public void clear() {
        products.clear();
        System.out.println("Корзина очищена");
    }

    public void printBasket() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
