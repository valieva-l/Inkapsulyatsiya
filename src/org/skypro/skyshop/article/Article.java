package org.skypro.skyshop.article;

public class Article implements Searchable {

    public String articleTitle;
    public String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    public String getSearchTerm() {
        return articleTitle + " " + articleText;
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getSearchableName() {
        return "";
    }

    @Override
    public String toString() {
        return  "Название статьи='" + articleTitle + '\'' +
                ", Текст статьи='" + articleText + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}
