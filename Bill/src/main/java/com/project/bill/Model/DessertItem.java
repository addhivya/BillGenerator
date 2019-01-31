package com.project.bill.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.bill.Util.DessertShoppee;
import lombok.Getter;
import lombok.Setter;


public abstract class DessertItem {
    @JsonProperty
    String name;

    public DessertItem(String name)
    {
        this.name=name;
    }

    public final String getName()
    {
        return this.name;
    }

    public String toString()
    {
        String name = DessertShoppee.convertStringBasedOnSize(this.getName());
        String price = DessertShoppee.convertBasedOnWidth(name, DessertShoppee.cents2dollarsAndCentsmethod(this.getcost()));
        return name + price;
    }

    public abstract int getcost();

}
