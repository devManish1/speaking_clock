package com.practice1.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TimeConverterService {

    private final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty"
    };

    private final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

public String convertTimeToWords(String time) {
    try {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour == 12 && minute == 0) {
            return "It's Midday";
        } else if (hour == 0 && minute == 0) {
            return "It's Midnight";
        } else {
            String hourWord = numNames[hour % 12];
            String minuteWord;

            if (minute == 0) {
                minuteWord = "";
            } else if (minute < 20) {
                minuteWord = numNames[minute];
            } else {
                minuteWord = tensNames[minute / 10] + numNames[minute % 10];
            }

            String result = "It's" + hourWord;
            if (!minuteWord.isEmpty()) {
                result += minuteWord;
            }
            return result.trim();
        }
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
        return "Invalid time format: " + time;
    }
}
}