package com.practice1.demo.controllers;

import com.practice1.demo.service.TimeConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeConverterController {

    @Autowired
    private TimeConverterService timeConverterService;

    @GetMapping("/time-to-words/{time}")
    public String getTimeInWords(@PathVariable String time) {
        return timeConverterService.convertTimeToWords(time);
    }
}

