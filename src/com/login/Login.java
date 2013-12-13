package com.login;

import java.util.regex.Pattern;

public class Login {

    // There is no reason to recompile it every time.
    private static final Pattern LOGIN_PATTERN = Pattern.compile("^[a-z]([a-z\\d\\.\\-]{0,18}[a-z\\d])?$", Pattern.CASE_INSENSITIVE);

    static boolean isValidLogin(String login) {
        return (login != null) && LOGIN_PATTERN.matcher(login).matches();
    }
}
