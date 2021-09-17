package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockModules {

    public final CarbonDeadlineModule carbonDeadlineModule;

    public final RenewablesModule renewablesModule;

    @JsonCreator
    public ClockModules(
            @JsonProperty("carbon_deadline_1")
            CarbonDeadlineModule carbonDeadlineModule,
            @JsonProperty("renewables_1")
            RenewablesModule renewablesModule
    ) {
        this.carbonDeadlineModule = carbonDeadlineModule;
        this.renewablesModule = renewablesModule;
    }

    public CarbonDeadlineModule getCarbonDeadlineModule() {
        return carbonDeadlineModule;
    }

    public RenewablesModule getRenewablesModule() {
        return renewablesModule;
    }

    
    
}
