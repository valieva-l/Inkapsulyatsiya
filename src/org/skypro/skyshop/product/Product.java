package org.skypro.skyshop.product;

public class Product {
    private String productName;
    private int productСost;


    public Product(String productName, int productСost) {
        this.productName = productName;
        this.productСost = productСost;
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
}
