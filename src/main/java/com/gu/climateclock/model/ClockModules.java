package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockModules {

    public final CarbonDeadlineModule carbonDeadlineModule;

    @JsonCreator
    public ClockModules(
            @JsonProperty("carbon_deadline_1")
            CarbonDeadlineModule carbonDeadlineModule
    ) {
        this.carbonDeadlineModule = carbonDeadlineModule;
    }
}
