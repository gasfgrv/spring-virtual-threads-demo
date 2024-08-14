package br.com.gasfgrv.threads_virtuais.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String get() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "Hello World";
    }

}
