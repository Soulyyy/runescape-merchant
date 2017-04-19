package com.merchant.runescape.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hola, merchant";
    }
}
