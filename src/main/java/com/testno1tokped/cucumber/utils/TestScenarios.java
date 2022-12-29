package com.testno1tokped.cucumber.utils;

public enum TestScenarios {

    T1("Test Palindrome");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
