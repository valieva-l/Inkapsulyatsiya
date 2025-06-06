package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];

    // Метод добавления продукта
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }

        System.out.println("Невозможно добавить продукт");
    }

    // Метод получения общей стоимости
    public int getTotalCost() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getProductСost();
            }
        }
        return total;
    }

    // Метод печати содержимого
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

    //метод поиска товара
    public boolean containsProduct(Product product) {
        for (Product p : products) {
            if (p != null && p.equals(product)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины
    public void clear() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println("Корзина очищена");
    }


}


