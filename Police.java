package com.tws.refactoring;

public class Police {
    int limit=18;
    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= limit;
    }
}
