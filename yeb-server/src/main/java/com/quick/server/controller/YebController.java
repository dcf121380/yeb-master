package com.quick.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */

@RestController
public class YebController {
    @RequestMapping("/yeb")
    public String run(){
        return "yeb success";
    }
}
