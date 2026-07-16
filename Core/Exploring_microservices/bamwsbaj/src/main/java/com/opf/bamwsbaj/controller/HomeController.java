package com.opf.bamwsbaj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {

        return "Hello, stranger";
    }
}
