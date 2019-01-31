package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Icecream extends DessertItem {
    int price;
    String name;

    @JsonCreator
    public Icecream(@JsonProperty("name") String name,@JsonProperty("price") int price) {
        super(name);
        this.price = price;
    }

    public int getcost() {
        return price;
    }


}
