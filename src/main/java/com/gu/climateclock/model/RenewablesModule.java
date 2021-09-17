package com.gu.climateclock.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RenewablesModule {

    public String description;
    public String flavor;
    public String growth;
    public double initial;
    public double rate;
    public double resolution;
    public List<String> labels;
    public String timestamp;
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
    public String getGrowth() {
        return growth;
    }
    public void setGrowth(String growth) {
        this.growth = growth;
    }
    public double getInitial() {
        return initial;
    }
    public void setInitial(double initial) {
        this.initial = initial;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getResolution() {
        return resolution;
    }
    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
    public List<String> getLabels() {
        return labels;
    }
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
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
