package com.company.classes;

import com.company.classes.devices.ACDevice;
import com.company.classes.devices.SSADevice;
import com.company.classes.devices.SSDevice;

public class PeixeVivoSystem {
    public static void main(String[] args) {
        Dam dam1 = new Dam("First Dam", "Pirapozinho");

        SSDevice ssDevice1 = new SSDevice("ssdev-1");

        SSADevice ssaDevice1 = new SSADevice("ssadev-1");

        ACDevice acDevice1 = new ACDevice("acdev-1");

        dam1.addDevice(ssDevice1);
        dam1.addDevice(ssaDevice1);
        dam1.addDevice(acDevice1);

        System.out.println("---- Increasing number of earthquakes ----");
        System.out.println(" ⏫ 1 Earthquake");
        dam1.increaseEarthquakeCount();
        System.out.println("\n ⏫ 2 Earthquakes");
        dam1.increaseEarthquakeCount();
        System.out.println("\n ⏫ 3 Earthquakes");
        dam1.increaseEarthquakeCount();
        System.out.println("\n ⏫ 4 Earthquakes");
        dam1.increaseEarthquakeCount();
        System.out.println("\n ⏫ 5 Earthquakes");
        dam1.increaseEarthquakeCount();
        System.out.println("\n ⏫ 6 Earthquakes");
        dam1.increaseEarthquakeCount();

        System.out.println("\n\n ✖ Removing the SS Device...");
        dam1.removeDevice(ssDevice1);

        System.out.println("\n ---- Increasing one more earthquake ----" + "\n ⏫ 7 Earthquakes");
        dam1.increaseEarthquakeCount();
    }
}
