package com.project.bill.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.bill.Model.*;
import lombok.Getter;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class Input {
    @JsonProperty("candy")
    List<Candy> candies;
    @JsonProperty("cookie")
    List<Cookie> Cookie;
    @JsonProperty("juice")
    List<Juice> juices;
    @JsonProperty("sundae")
    List<Sundae> sundaes;
    @JsonProperty("icecream")
    List<Icecream> iceCream;

    public List<Candy> getCandies() {
        return candies;
    }

    public List<com.project.bill.Model.Cookie> getCookie() {
        return Cookie;
    }

    public List<Juice> getJuices() {
        return juices;
    }

    public List<Sundae> getSundaes() {
        return sundaes;
    }

    public List<Icecream> getIceCream() {
        return iceCream;
    }
}
