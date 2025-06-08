package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.article.SearchEngine;
import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.basket.ProductBasket;

import org.skypro.skyshop.product.Product;

public class App {
    private static SearchEngine searchEngine;

    public static void main(String[] args) {

        SearchEngine searchEngine = new SearchEngine(10);


        searchEngine.add(new Product("Помидор", 259));
        searchEngine.add(new Product("Огурцы", 150));
        searchEngine.add(new Product("Макароны", 200));
        searchEngine.add(new Product("Сыр", 239));
        searchEngine.add(new Product("Молоко", 96));
        searchEngine.add(new Product("Хлеб", 54));


        Article article1 = new Article("Здоровое питание", "Польза употреблении овощей");
        Article article2 = new Article("Рецепты с молочной продукцией", "Вкусные рецепты с использованием молочной продукции");
        Article article3 = new Article("Что калорийнее — хлеб или макароны?", "Практические советы и рецепты для более здорового выбора углеводов");


        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);


        System.out.println("\nПоиск по слову 'Что калорийнее — хлеб или макароны?':");
        Searchable[] results1 = searchEngine.search("Макароны");
        printResults(results1);

        System.out.println("\nПоиск по слову 'Здоровое питание':");
        Searchable[] results2 = searchEngine.search("Помидор");
        printResults(results2);

        System.out.println("\nПоиск по слову 'Яблоко':");
        Searchable[] results3 = searchEngine.search("Яблоко");
        printResults(results3);
    }

    private static void printResults(Searchable[] results) {
        if (results.length == 0) {
            System.out.println("Ничего не найдено.");
        } else {
            for (Searchable item : results) {
                if (item != null) {
                    System.out.println(item.getSearchTerm());
                }

            }
        }
    }
}




