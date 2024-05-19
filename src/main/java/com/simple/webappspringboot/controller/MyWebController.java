package com.simple.webappspringboot.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/web-app")
public class MyWebController {

    @GetMapping("/home")
    public ResponseEntity<? extends Object> getHomePage() {
        try {
            Resource resource = new ClassPathResource("static/index.html");
            return ResponseEntity.ok().body(resource);
        } catch (Exception e) {
            // Handle error if the file is not found or other exceptions
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/dynamic")
    public String dynamicPage(@RequestParam(name = "show", required = false) boolean show, Model model) {
        model.addAttribute("features", Arrays.asList(
                "ABC",
                "DEF",
                "GHI"
        ));
        model.addAttribute("show", show);
        return "dynamic-page";
    }

}
