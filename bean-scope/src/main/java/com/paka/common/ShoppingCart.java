package com.paka.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> foods;

    public ShoppingCart() {this.foods = new ArrayList<>(); }

    public void addFood(Product food) {foods.add(food);}

    public List<Product> getFood() {return foods;}
}