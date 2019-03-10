package com.dem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EchoController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(String name) {
        return "echo:" + name;
    }
}
