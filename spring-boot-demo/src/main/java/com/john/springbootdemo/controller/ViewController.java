package com.john.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JohnZhong
 *
 * 测试freemarker view resolver
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping("/helloFTL")
    public String helloFTL(Model model){
        model.addAttribute("message", "hello! freemarker!");
        return "freemarker_test";
    }
}
