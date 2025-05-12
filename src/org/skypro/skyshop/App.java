package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

public class App {

    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();




        // Добавление продукта в корзину
        //<имя продукта>: <стоимость>
        Product tomato = new SimpleProduct("Помидор", 259);
        System.out.println("tomato = " + tomato.getProductName());
        System.out.println("tomatoСost = " + tomato.getProductСost());
        System.out.println("Специальный товар? " + tomato.getIsSpecial());

        // <имя продукта со скидкой>: <стоимость> (<скидка>%)
        Product cucumbers = new DiscountedProduct("Огурцы", 150, 20);
        System.out.println("cucumbers = " + cucumbers.getProductName());
        System.out.println(cucumbers);
        System.out.println("Специальный товар? " + cucumbers.getIsSpecial());


        //<имя продукта c фиксированной ценой>: Фиксированная цена <значение константы фиксированной цены>
        Product pasta = new FixPriceProduct("Макароны");
        System.out.println(pasta);
        System.out.println("Специальный товар? " + pasta.getIsSpecial());

        Product cheese = new SimpleProduct("Сыр", 239);
        System.out.println("cheese = " + cheese.getProductName());
        System.out.println("cheeseСost = " + cheese.getProductСost());
        System.out.println("Специальный товар? " + cheese.getIsSpecial());

        Product milk = new SimpleProduct("Молоко", 96);
        System.out.println("milk = " + milk.getProductName());
        System.out.println("milkСost = " + milk.getProductСost());
        System.out.println("Специальный товар? " + milk.getIsSpecial());

        Product bread = new SimpleProduct("Хлеб", 54);
        System.out.println("bread = " + bread.getProductName());
        System.out.println("breadСost = " + bread.getProductСost());
        System.out.println("Специальный товар? " + bread.getIsSpecial());

        Product oil = new SimpleProduct("Масло", 120);
        System.out.println("oil = " + oil.getProductName());
        System.out.println("oilСost = " + oil.getProductСost());
        System.out.println("Специальный товар? " + oil.getIsSpecial());

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

        System.out.println("Есть сыр? " + basket.containsProduct(new SimpleProduct("Сыр", 239))); // true
        System.out.println("Есть груша? " + basket.containsProduct(new SimpleProduct("Груша", 300))); // false

        // Очистка корзины
        basket.clear();

        // Проверка после очистки
        basket.printContents(); // Пустая
        System.out.println("Общая цена: " + basket.getTotalCost()); // 0
        System.out.println("Есть банан? " + basket.containsProduct(new SimpleProduct("Банан>", 100))); // false

    }
}










