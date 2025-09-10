package com.example.Log.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/map")
public class MyLog {

    private static final Logger log = LoggerFactory.getLogger(MyLog.class);

    @Autowired
    Environment environment;




    @GetMapping
    public String logMethod(){

        log.debug("From Debug");
        log.warn("From Warn");
        log.trace("From trace");
        log.info("From info");
        log.error("From error");

        return "Hello Guyys";
    }

}
