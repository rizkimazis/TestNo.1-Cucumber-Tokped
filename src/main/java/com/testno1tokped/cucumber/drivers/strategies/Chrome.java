package com.testno1tokped.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedrivers.exe"); //WebDriversManagers.chrome.setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        return new ChromeDriver(options);
    }
}
