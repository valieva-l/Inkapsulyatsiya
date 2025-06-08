package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    private int productСost;
    public SimpleProduct(String productName, int productСost) {
        super(productName);
        this.productСost = productСost;
    }

    @Override
    public int getProductСost() {
        return productСost;

    }
}
