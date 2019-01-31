package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Juice extends DessertItem{

    int litter;
    int price;
    @JsonCreator
    public Juice(@JsonProperty("name") String name,@JsonProperty("liter") int litter,@JsonProperty("price") int price) {
        super(name);
        this.litter = litter;
        this.price = price;
    }

    @Override
    public int getcost() {
        return litter*price;
    }
}
