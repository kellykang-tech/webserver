package com.github.kelly.http.cookie;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class Cookie {

    private final String name;
    private final String value;   // session id

    // Optional
    private String expires;
    private String maxAge;



    public Cookie(String name, String value) {
        this.name = name;
        this.value = value;
    }


    // Expires=Mon, 21 Feb 2022 07:28:00 GMT
    public void setExpires(LocalDateTime dateTime) {
        String dayName = dateTime.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);
        int day = dateTime.getDayOfMonth();
        String month = dateTime.getMonth().getDisplayName(TextStyle.SHORT, Locale.US);
        int year = dateTime.getYear();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();

        this.expires = "Expires=" + dayName + ", " + day + " " + month + " " + year + " " + hour + ":" + minute + ":" + second + " GMT";
    }

    public void setMaxAge(int number) {
        this.maxAge = "Max-Age=" + number;

    }

    public String createCookie() {
        StringBuilder attributes = new StringBuilder();
        StringBuilder cookie = attributes.append(name).append("=").append(value);

        if (expires != null) {
            cookie.append("; ").append(expires);
        }

        if (maxAge != null) {
            cookie.append("; ").append(maxAge);
        }

        return cookie.toString();
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
