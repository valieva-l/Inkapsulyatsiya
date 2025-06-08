package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    public int basePrice;
    private int discountPercentage;

    public DiscountedProduct(String productName, int basePrice, int discountPercentage) {
        super(productName,basePrice);
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Процент скидки должен быть в диапазоне от 0 до 100 включительно.");
        }
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



