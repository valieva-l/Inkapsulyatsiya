package org.skypro.skyshop.article;

public class SearchEngine {

    private Searchable[] searchableItems;
    private int currentIndex; // Индекс для добавления новых элементов

    public SearchEngine(int size) {
        searchableItems = new Searchable[size]; // Инициализируем массив с переданным размером
        currentIndex = 0; // Инициализируем индекс
    }

    // Метод для добавления нового объекта типа Searchable
    public void add(Searchable item) {
        if (currentIndex < searchableItems.length) {
            searchableItems[currentIndex] = item; // Добавляем элемент в массив
            currentIndex++;
        } else {
            System.out.println("Массив заполнен! Невозможно добавить больше элементов.");
        }
    }

    // Метод для поиска по терминам
    public Searchable[] search(String term) {
        Searchable[] results = new Searchable[5]; // Массив для хранения результатов
        int count = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().contains(term)) {
                if (count < 5) {
                    results[count] = item; // Сохраняем результат
                    count++;
                } else {
                    break; // Если уже нашли 5 результатов, выходим из цикла
                }
            }
        }

        // Возвращаем массив результатов, обрезаем до фактического количества найденных элементов
        return java.util.Arrays.copyOf(results, count);
    }
}



