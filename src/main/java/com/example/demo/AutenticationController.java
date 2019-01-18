package com.example.demo;

import com.example.demo.AutenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AutenticationController {

    @GetMapping(path = "/basicauth")
    public AutenticationBean authenticationBean() {
        return new AutenticationBean("You are authenticated");
    }

}
