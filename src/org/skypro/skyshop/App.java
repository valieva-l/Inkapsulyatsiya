package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        // Добавление продукта в корзину
        Product tomato = new Product("Помидор", 259);
        System.out.println("tomato = " + tomato.getProductName());
        System.out.println("tomatoСost = " + tomato.getProductСost());

        Product cucumbers = new Product("Огурцы", 150);
        System.out.println("cucumbers = " + cucumbers.getProductName());
        System.out.println("cucumbersСost = " + cucumbers.getProductСost());

        Product pasta = new Product("Макароны", 200);
        System.out.println("pasta = " + pasta.getProductName());
        System.out.println("pastaСost = " + pasta.getProductСost());

        Product cheese = new Product("Сыр", 239);
        System.out.println("cheese = " + cheese.getProductName());
        System.out.println("cheeseСost = " + cheese.getProductСost());

        Product milk = new Product("Молоко", 96);
        System.out.println("milk = " + milk.getProductName());
        System.out.println("milkСost = " + milk.getProductСost());

        Product bread = new Product("Хлеб", 54);
        System.out.println("bread = " + bread.getProductName());
        System.out.println("breadСost = " + bread.getProductСost());

        Product oil = new Product("Масло", 120);
        System.out.println("oil = " + oil.getProductName());
        System.out.println("oilСost = " + oil.getProductСost());

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket.addProduct(tomato);
        basket.addProduct(cucumbers);
        basket.addProduct(pasta);
        basket.addProduct(cheese);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(oil);

        //Печать содержимого корзины с несколькими товарами
        //Получение стоимости корзины с несколькими товарами
        basket.printContents();

        // Поиск товара, который есть в корзине

        System.out.println("Есть сыр? " + basket.containsProduct(new Product("Сыр", 239))); // true
        System.out.println("Есть груша? " + basket.containsProduct(new Product("Груша", 300))); // false

        // Очистка корзины
        basket.clear();

        // Проверка после очистки
        basket.printContents(); // Пустая
        System.out.println("Общая цена: " + basket.getTotalCost()); // 0
        System.out.println("Есть банан? " + basket.containsProduct(new Product("Банан>", 100))); // false
    }

}




