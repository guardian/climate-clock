package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockData {
    public ClockModules modules;

    public ClockModules getModules() {
        return modules;
    }

    public void setModules(ClockModules modules) {
        this.modules = modules;
    }
    
}
