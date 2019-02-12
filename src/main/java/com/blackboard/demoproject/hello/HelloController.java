package com.blackboard.demoproject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdivakarla on 24/01/19.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hiMethod(){
        return "hi";
    }
}
