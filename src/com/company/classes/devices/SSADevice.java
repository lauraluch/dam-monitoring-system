package com.company.classes.devices;

import com.company.classes.Dam;
import com.company.interfaces.Observer;

public class SSADevice implements Observer {
    private String identifier;
    private double earthquakeLevel;
    private static final double SAFETY_LINE = 3;

    public SSADevice(String identifier) {
        this.identifier = identifier;
        this.earthquakeLevel = 0.0;
    }

    @Override
    public void update(Dam dam) {
        earthquakeLevel = dam.getEarthquakeCounter();
        if (earthquakeLevel >= SAFETY_LINE) System.out.println("SSA Device " + identifier + ": 🔊");
        else System.out.println("SSA Device " + identifier + ": 🔈");
    }
}
