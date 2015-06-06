package com.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/")
    public Item index() {
        Item item = new Item();
        item.setName("demo");
        return item;
    }

}
