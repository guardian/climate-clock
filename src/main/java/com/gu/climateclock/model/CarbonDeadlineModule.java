package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarbonDeadlineModule {
    public String deadline;
    public String flavor;
    public List<String> labels;
    public String timestamp;
    public String type;

    @JsonProperty("update_interval_seconds")
    public int updateIntervalSeconds;
}
