package com.company.classes.devices;

import com.company.classes.Dam;
import com.company.interfaces.Observer;

public class ACDevice implements Observer {
    private String identifier;

    public ACDevice(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public void update(Dam dam) {
        if(dam.getEarthquakeCounter() >= 6) System.out.println("AC Device " + identifier + ": EVACUATION ALARM 🔊");
        else System.out.println("AC Device " + identifier + ": 🔈");
    }

}
