package com.example.cicd_deploy.alert.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class AlertController {

    @GetMapping("/alert")
    public String alert() {
           return  "완벽합니다.";
    }
    @GetMapping("/alert1")
    public String alert1() {
           return  "계속합니다.";
    }
    @GetMapping("/alert2")
    public String alert2() {
           return  "성공입니다.";
    }
}
