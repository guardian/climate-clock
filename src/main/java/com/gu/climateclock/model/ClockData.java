package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockData {

    public final ClockModules modules;

    @JsonCreator
    public ClockData(
            ClockModules modules
    ) {
        this.modules = modules;
    }
}
