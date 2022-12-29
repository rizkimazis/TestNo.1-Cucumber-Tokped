package com.testno1tokped.cucumber.step_definitions;

import com.testno1tokped.cucumber.pages.Palindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPalindrome {
    Palindrome palindrome = new Palindrome();

    @Test
        void testPalindrome(){
        Assert.assertTrue(palindrome.isPalindrome("malam"));
        System.out.println("Teks adalah palindrome");
        System.out.println("");
        Assert.assertFalse(palindrome.isPalindrome("siza analuam ikziR"));
        System.out.println("Teks bukan Palindrome");
    }
}
