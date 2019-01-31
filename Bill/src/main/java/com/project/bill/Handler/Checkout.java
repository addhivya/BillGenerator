package com.project.bill.Handler;

import com.project.bill.Model.*;
import com.project.bill.Util.DessertShoppee;
import com.project.bill.request.Input;
import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class Checkout {
    float cost;

    Vector<DessertItem> vlist = new Vector<>();

    public void enterInput(Input input) {
        this.clear();
        if(input.getCandies()!=null) {
            for (Candy candy : input.getCandies()) {
                this.enterItem(candy);
            }
        }
        if(input.getJuices()!=null) {
            for (Juice juice : input.getJuices()) {
                this.enterItem(juice);
            }
        }
        if(input.getIceCream()!=null) {
            for (Icecream icecream : input.getIceCream()) {
                this.enterItem(icecream);
            }
        }
        if(input.getSundaes()!=null) {
            for (Sundae sundae : input.getSundaes()) {
                this.enterItem(sundae);
            }
        }
        if(input.getCookie()!=null) {
            for (Cookie cookie : input.getCookie()) {
                this.enterItem(cookie);
            }
        }
    }

    private void enterItem(DessertItem item) {
        vlist.add(item);
        cost = cost + item.getcost();
    }

    private void clear() {
        vlist.clear();
        cost = 0;
    }

    private int numberOfItems() {
        return vlist.size();
    }

    private int totalCost() {
        return (int) cost;
    }

    private int totalTax() {
        float tax = this.totalCost() / DessertShoppee.TAX_RATE;
        return (int) tax;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(DessertShoppee.printHeadingCentre());
        result.append("\n\n");

        for (int i = 0; i < vlist.size(); i++) {
            result.append(vlist.get(i));
            result.append("\n");
        }
        result.append("\n");
        String tax = DessertShoppee.cents2dollarsAndCentsmethod(this.totalTax());
        result.append("Tax" + DessertShoppee.convertBasedOnWidth("Tax", tax));
        String total = DessertShoppee.cents2dollarsAndCentsmethod(this.totalCost() + this.totalTax());
        result.append("\nTotal Cost" + DessertShoppee.convertBasedOnWidth("Total Cost", total));

        System.out.println(result.toString());
        return result.toString();
    }
}
