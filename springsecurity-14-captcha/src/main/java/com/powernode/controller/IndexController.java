package com.powernode.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "main";
    }
}
