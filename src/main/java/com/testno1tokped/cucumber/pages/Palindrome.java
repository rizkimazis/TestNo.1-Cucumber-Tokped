package com.testno1tokped.cucumber.pages;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String value){

        String temp = "";

        for (int i = value.length() -1; i >= 0; i--){
            temp = temp + value.charAt(i);
        }
        System.out.println(temp);
        return temp.equals(value);
    }
}