package org.skypro.skyshop.article;

public interface Searchable {

    String getSearchTerm();  // Метод получения термина поиска
    String getContentType();  // Метод получения типа контента
    String getSearchableName();// Метод получения имени Searchable-объекта

    void print();

    default String getStringRepresentation() {
        return "имя" +  getSearchableName() + " — тип " + getContentType(); // Метод преобразования Searchable-объекта в строку

    }
}
