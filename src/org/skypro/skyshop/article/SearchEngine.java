package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Product;

import java.util.List;

public class SearchEngine extends Article {

    private Searchable[] searchableItems;
    private int currentIndex;

    public SearchEngine(int size) {
        searchableItems = new Searchable[size];
        currentIndex = 0;
    }

    public void add(Searchable item) {
        if (currentIndex < searchableItems.length) {
            searchableItems[currentIndex] = item;
            currentIndex++;
        } else {
            System.out.println("Массив заполнен! Невозможно добавить больше элементов.");
        }
    }

    public Searchable[] search(String term) {
        Searchable[] results = new Searchable[5];
        int count = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().contains(term)) {
                if (count < 5) {
                    results[count] = item;
                    count++;
                } else if (count >= 5) {
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(results, count);
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable item : searchableItems) {
            if (item != null) { // Проверка на null
                int count = item.getSearchTerm().split(search, -1).length - 1;
                if (count > maxCount) {
                    maxCount = count;
                    bestMatch = item;
                }
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound("Не найдено подходящих результатов для запроса: " + search);
        }
        return bestMatch;
    }

    private int countOccurrences(String str, String search) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(search, index)) != -1) {
            count++;
            index += search.length();
        }
        return count;
    }

    public void add(Product productName) {
    }

}
