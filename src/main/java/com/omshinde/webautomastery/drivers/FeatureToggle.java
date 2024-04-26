package com.omshinde.webautomastery.drivers;

public enum FeatureToggle {
    HEADLESS(Boolean.parseBoolean(System.getProperty("headless","false"))),
    RESPONSIVE(Boolean.parseBoolean(System.getProperty("responsive","false"))),
    LOGGER(Boolean.parseBoolean(System.getProperty("logger","false")));

    private  final boolean state;

    FeatureToggle(boolean state) {
        this.state=state;
    }

    public Boolean isOn(){
        return state;
    }

    public Boolean isOff(){
        return !state;
    }
}
