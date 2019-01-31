package com.project.bill.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Output {
    final String bill;

    public Output(String bill) {
        this.bill = bill;
    }
}
