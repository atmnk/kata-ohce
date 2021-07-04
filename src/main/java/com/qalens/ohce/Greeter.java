package com.qalens.ohce;

import jdk.jshell.spi.ExecutionControl;

public class Greeter {
    int hour;

    public Greeter(int hour) {
        this.hour = hour;
    }
    public String getGreetingFor(String name){
        String greeting="";
        if (hour >= 20 || hour <= 6) {
            greeting = "¡Buenas noches " + name;
        }
        return greeting;
    }
}
