package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    public int basePrice;
    private int discountPercentage;

    public DiscountedProduct(String productName, int basePrice, int discountPercentage) {
        super(productName);
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getProductСost() {
        int discountAmount = (basePrice * discountPercentage) / 100; // Считаем сумму скидки
        return basePrice - discountAmount; // Возвращаем цену со скидкой
    }



    public boolean getIsSpecial() {
        return true;
    }


    @Override
    public String toString() {
        return "Товар со скидкой: Базовая цена: " + basePrice + ", Скидка: " + discountPercentage + "%, Итоговая цена: " + getProductСost();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



