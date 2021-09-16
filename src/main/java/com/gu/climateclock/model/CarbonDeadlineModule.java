package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarbonDeadlineModule {

    public final String deadline;
    public final String flavor;
    public final List<String> labels;
    public final String timestamp;
    public final String type;
    public final int updateIntervalSeconds;

    @JsonCreator
    public CarbonDeadlineModule(
            String deadline,
            String flavor,
            List<String> labels,
            String timestamp,
            String type,
            @JsonProperty("update_interval_seconds") int updateIntervalSeconds
    ) {
        this.deadline = deadline;
        this.flavor = flavor;
        this.labels = labels;
        this.timestamp = timestamp;
        this.type = type;
        this.updateIntervalSeconds = updateIntervalSeconds;
    }
}
