package com.practice1.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConverterServiceTest {
    TimeConverterService timeConverterService = new TimeConverterService();

    @Test
    void testConvertTimeToWords() {
        String result = timeConverterService.convertTimeToWords("08:00");
        Assertions.assertEquals("It's  eight", result);
    }

    @Test
    public void testConvertTimeToWordsAllCase() {

        // Test cases for valid inputs
        Assertions.assertEquals("It's Midnight", timeConverterService.convertTimeToWords("00:00"));
        Assertions.assertEquals("It's Midday", timeConverterService.convertTimeToWords("12:00"));
        Assertions.assertEquals("It's one", timeConverterService.convertTimeToWords("01:00"));
        Assertions.assertEquals("It's two fifteen", timeConverterService.convertTimeToWords("02:15"));
        Assertions.assertEquals("It's ten thirty", timeConverterService.convertTimeToWords("10:30"));

        // Test case for invalid input format
        Assertions.assertEquals("Invalid time format: 24:60", timeConverterService.convertTimeToWords("24:60"));

        // Test case for invalid input type
        Assertions.assertEquals("Invalid time format: 12:AB", timeConverterService.convertTimeToWords("12:AB"));
    }
}