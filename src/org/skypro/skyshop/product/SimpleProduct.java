package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    private int productСost;

    public SimpleProduct(String productName, int productСost) {
        super(productName);
        this.productСost = productСost;
        if (productСost <= 0) {
            throw new IllegalArgumentException("Цена продукта должна быть больше 0.");
        }
    }

    @Override
    public int getProductСost() {
        return productСost;

    }
}
