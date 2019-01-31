package com.project.bill.Controller;

import com.project.bill.Handler.Checkout;
import com.project.bill.request.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
public class Shop {

    @Autowired
    Checkout checkout;

    @RequestMapping(method= RequestMethod.PUT, produces = "text/plain")
    public String enterItem(@RequestBody Input input) {
       // checkout.enterItem(new item("Peanut Butter Fudge", 2.25f, 399));
        checkout.enterInput(input);
        return checkout.toString();
    }

}
