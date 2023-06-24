package com.javabank.bank;

import java.util.Random;

public class Captcha {
    private String keys = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String captcha = "";

    /* to generate random string and return it */
    public String generateCaptcha() {
        captcha = "";
        for (int i = 0; i < 5; i++) {
            captcha += keys.charAt(new Random().nextInt(keys.length()));
        }
        return captcha;
    }

    /* to generate captcha with given length and return it */
    String generateCaptcha(int n) {
        for (int i = 0; i < n; i++) {
            captcha += keys.charAt(new Random().nextInt(keys.length()));
        }
        return captcha;
    }

    /* to validate captcha */
    public boolean validateCaptcha(String x) {
        if (captcha.equals(x))
            return true;
        return false;
    }
}