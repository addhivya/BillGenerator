package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Candy extends DessertItem {
    float weight;
    int price;

    @JsonCreator
    public Candy(@JsonProperty("name") String name, @JsonProperty("weight") float weight, @JsonProperty("price") int price) {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    public int getcost() {
        return Math.round(this.price * this.weight);
    }

    public String toString() {
        String header = String.valueOf(weight + " lbs. @" + price * 0.01 + " /lb.\n");
        return header + super.toString();
    }
}
