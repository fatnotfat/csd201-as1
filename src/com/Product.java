/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author HAU NUONG MO HANH
 */
public class Product {

    String code = "";
    String name = "";
    int price = 0;
    int guaranty = 0;

    public Product() {
    }

    public Product(String c, String n, int p, int g) {
        code = c;
        name = n;
        price = p;
        guaranty = g;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(int guaranty) {
        this.guaranty = guaranty;
    }

    public boolean equals(Product pro) {
        return pro.getCode().equals(this.getCode())
                && pro.getName().equals(this.getName())
                && pro.getPrice() == this.getPrice()
                && pro.getGuaranty() == this.getGuaranty();
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + price + "\t" + guaranty;
    }
    
}
