package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockResponse {
    public ClockData data;
    public String status;
}
