package com.company.classes.devices;

import com.company.classes.Dam;
import com.company.interfaces.Observer;

public class SSDevice implements Observer {
    private String identifier;
    private boolean isAboveLimit;

    public SSDevice(String identifier) {
        this.identifier = identifier;
        this.isAboveLimit = false;
    }

    @Override
    public void update(Dam dam) {
        if(dam.getEarthquakeCounter() >= 2){
            isAboveLimit = true;
            System.out.println("SS Device " + identifier + ": 🟥");
        }
        else {
            isAboveLimit = false;
            System.out.println("SS Device " + identifier + ": ⬜");
        }
    }
}
