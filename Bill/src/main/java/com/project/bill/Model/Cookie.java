package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cookie extends DessertItem {
    int number;
    int cost;
    float price;

    @JsonCreator
    public Cookie(@JsonProperty("name") String name,@JsonProperty("number") int number,@JsonProperty("price") float priceperdozen) {
        super(name);
        this.number = number;
        this.price = priceperdozen;
        cost = Math.round(number * (price / 12));
    }

    public int getcost() {
        return cost;
    }

    public String toString() {
        String header = String.valueOf(this.number + "@ " + price * 0.01 + " /dz \n");
        return header + super.toString();
    }

    // 2 Concepts

    // High Cohession -> Class does only its work.
    // Low coupling -> Depence coupling.
}
