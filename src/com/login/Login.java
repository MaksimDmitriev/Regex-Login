package com.login;

import java.util.regex.Pattern;

/**
 * This class contains one method that checks if the login meets the requirements listed below.
 * <br>
 * The login format requirements:
 * <ol>
 * <li>The login must start with a Latin letter.</li>
 * <li>The login must finish with either a Latin letter or a digit.</li>
 * <li>There may also be digits, dots, and minus signs in the login.</li>
 * <li>Min. login length is 1.</li>
 * <li>Max. login length is 20.</li>
 * </ol>
 * 
 * @author Maksim Dmitriev
 * 
 */
public class Login {

    // There is no reason to recompile it every time.
    /**
     * The regular expression used in {@link #isValidLogin(String)}
     */
    private static final Pattern LOGIN_PATTERN = Pattern.compile("^[a-z]([a-z\\d\\.\\-]{0,18}[a-z\\d])?$", Pattern.CASE_INSENSITIVE);

    /**
     * The constructor prevents client code from creating instances of this class by throwing an
     * {@link AssertionError}
     */
    private Login() {
        throw new AssertionError();
    }

    /**
     * @author Maksim Dmitriev
     * @param login Given login
     * @return if the login meets the requirements.
     * 
     */
    static boolean isValidLogin(String login) {
        return (login != null) && LOGIN_PATTERN.matcher(login).matches();
    }
}
