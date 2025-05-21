package org.skypro.skyshop.article;

public interface Searchable {

    String getSearchTerm();
    String getContentType();
    String getSearchableName();

    void print();

    default String getStringRepresentation() {
        return "имя" +  getSearchableName() + " — тип " + getContentType();

    }
}
