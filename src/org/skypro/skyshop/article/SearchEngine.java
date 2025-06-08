package org.skypro.skyshop.article;

public class SearchEngine {

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
                } else  if (count >=5){
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(results, count);
    }
}



