package org.skypro.skyshop.article;

import java.util.List;

public interface Searchable {

    String getSearchTerm();

    String getContentType();

    String getSearchableName();

    default String getStringRepresentation() {
        return "имя" + getSearchableName() + " — тип " + getContentType();
    }
}
