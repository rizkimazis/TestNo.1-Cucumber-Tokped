package com.testno1tokped.cucumber.drivers.strategies;

import com.testno1tokped.cucumber.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.CHROMEHEADLESS:
                return new ChromeHeadless();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}
