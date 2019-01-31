package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sundae extends Icecream {
    String topname;
    int topprice;
    int price;
    int cost;

    @JsonCreator
    public Sundae(@JsonProperty("tname") String toppingname,@JsonProperty("tprice") int toppingprice,@JsonProperty("name") String name,@JsonProperty("price") int price) {
        super(name + " with " + toppingname, price);
        this.topname = toppingname;
        this.price = price;
        this.topprice = toppingprice;
    }

    public int getcost() {
        cost = (price + topprice);
        return cost;
    }


}
