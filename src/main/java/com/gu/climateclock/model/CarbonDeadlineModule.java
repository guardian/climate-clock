package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarbonDeadlineModule {
    public String description;
    public String flavor;
    public List<String> labels;
    public Deadline timestamp;
    public String type;
    public int updateIntervalSeconds;
  
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Deadline getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Deadline timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUpdateIntervalSeconds() {
        return updateIntervalSeconds;
    }

    @JsonProperty("update_interval_seconds")    
    public void setUpdateIntervalSeconds(int updateIntervalSeconds) {
        this.updateIntervalSeconds = updateIntervalSeconds;
    }

    
}
