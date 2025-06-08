package org.skypro.skyshop.product;

import org.skypro.skyshop.article.Searchable;

public class Product implements Searchable {
    public String productName;
    private int productСost;


    public Product(String productName, int productСost) {
        this.productName = productName;
        this.productСost = productСost;
    }

    public Product(String productName) {
    }

    public String getProductName() {

        return productName;
    }


    public int getProductСost() {

        return productСost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.productName.equals(other.productName);
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getSearchableName() {
        return "";
    }
}
