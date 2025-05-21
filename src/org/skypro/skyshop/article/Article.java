package org.skypro.skyshop.article;

public class Article implements Searchable {

    private String articleTitle;
    private String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    public String getSearchTerm() {
        return articleTitle + " " + articleText;
    }

        @Override
        public String getContentType() {
            return "Тип";
        }

    @Override
    public String getSearchableName() {
        return "Имя";
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
