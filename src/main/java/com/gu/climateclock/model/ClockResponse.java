package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockResponse {

    public final ClockData data;
    public final String status;

    @JsonCreator
    public ClockResponse(
            ClockData data,
            String status
    ) {
        this.status = status;
        this.data = data;
    }
}
