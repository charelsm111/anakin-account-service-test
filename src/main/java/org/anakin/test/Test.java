package org.anakin.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Test {

    @GetMapping("/")
    public String index(final Model model) {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
}
