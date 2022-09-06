package com.trxjster.controller;

import com.trxjster.service.HelloWorldService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    public String helloWorld(){
        return helloWorldService.helloFromService();
    }


}
