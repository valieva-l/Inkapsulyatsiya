package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    public static final int FIX_PRODUCT = 200;

    public FixPriceProduct(String productName) {
        super(productName);
    }


    public int getProductСost() {
        return FIX_PRODUCT;
    }


    public boolean getIsSpecial() {
        return true;
    }



    public String toString() {

        return getProductName() + " Фиксированная цена " + FIX_PRODUCT;
    }


}
