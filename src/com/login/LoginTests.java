package com.login;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTests {

    /**
     * The login contains small Latin letters only
     */
    @Test
    public void testLatin() {
        assertTrue(Login.isValidLogin("abc"));
    }

    /**
     * The login contains both small and capital Latin letters
     */
    @Test
    public void testSmallCapitalLetters() {
        assertTrue(Login.isValidLogin("aBcDfgHI"));
    }

    /**
     * The login contains capital Latin letters only
     */
    @Test
    public void testCapitalLetters() {
        assertTrue(Login.isValidLogin("ABCDEF"));
    }

    /**
     * The login contains Latin letters and minus signs
     */
    @Test
    public void testLatinMinus() {
        assertTrue(Login.isValidLogin("ab-----c"));
    }

    @Test
    public void testLatinDigit() {
        assertTrue(Login.isValidLogin("a123456789bc"));
    }

    /**
     * The login contains Latin letters and dots
     */
    @Test
    public void testLatinDots() {
        assertTrue(Login.isValidLogin("a..c"));
    }

    /**
     * The login contains Latin letters and minus signs
     */
    @Test
    public void testLatinMinusDotDigit() {
        assertTrue(Login.isValidLogin("a123-45-67-8-..--9bc"));
    }

    /**
     * A digit is at the end
     */
    @Test
    public void testLastDigit() {
        assertTrue(Login.isValidLogin("ABC------B4"));
    }

    /**
     * A digit comes first
     */
    @Test
    public void testBadFormatFirstDigit() {
        assertFalse(Login.isValidLogin("12abc"));
    }

    /**
     * The login is too long
     */
    @Test
    public void testTooLong() {
        assertFalse(Login.isValidLogin("ABC------Bdsfjhrefhjgwerhjgfhjreghjerhjghje"));
    }

    /**
     * The login is empty
     */
    @Test
    public void testEmpty() {
        assertFalse(Login.isValidLogin(""));
    }

    /**
     * The login is empty
     */
    @Test
    public void testOne() {
        assertTrue(Login.isValidLogin("U"));
    }

    /**
     * The login is null
     */
    @Test
    public void testNull() {
        assertFalse(Login.isValidLogin(null));
    }
}
