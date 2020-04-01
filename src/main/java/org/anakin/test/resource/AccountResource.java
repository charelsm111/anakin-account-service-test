package org.anakin.test.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountResource {

    @GetMapping("/index")
    public String getIndex() {

        return "This is account index";
    }
}
