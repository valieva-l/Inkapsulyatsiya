package org.skypro.skyshop.product;

public abstract class  Product {
    private String productName;
    boolean isSpecial;

    public boolean getIsSpecial() {
        this.isSpecial = isSpecial;
        return false;
    }

//    public abstract IsSpecial(boolean isSpecial) {
//        this.isSpecial = isSpecial;
//    }


    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.productName.equals(other.productName);
    }



public abstract int getProductСost();

}

