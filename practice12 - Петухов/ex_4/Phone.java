package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private String code, first, second, third;
    private final String regex = "^(8|\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$";

    public Phone(String phone) throws Exception {
        Matcher matcher = Pattern.compile(regex).matcher(phone);
        if (matcher.find()) {
            code = matcher.group(1);
            first = matcher.group(2);
            second = matcher.group(3);
            third = matcher.group(4);
        } else throw new Exception("No matches");
    }

    @Override
    public String toString() {
        return String.format("+%s%s-%s-%s", code, first, second, third);
    }
}
