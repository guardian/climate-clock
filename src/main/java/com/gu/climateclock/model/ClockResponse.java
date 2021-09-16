package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockResponse {

    private ClockData data;

    private String status;

    public ClockData getData() {
        return data;
    }
    public void setData(ClockData data) {
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
