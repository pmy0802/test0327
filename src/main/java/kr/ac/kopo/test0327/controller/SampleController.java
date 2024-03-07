package kr.ac.kopo.test0327.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"Hello", "World"};
    }
}
