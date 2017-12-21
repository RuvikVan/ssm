package com.frame.ssm.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @author van
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    private String list(Model model) {
        ArrayList<String>arrayList = new ArrayList<String>();
        return "helloworld";
    }

}
