package com.gu.climateclock.model;

public class ClimateCrisisData {
 
    public ClockResponse clockResponse;
    public GuMobileFrontsResponse guMobileFrontsResponse;
    public String stylesheet;

    public ClockResponse getClockResponse() {
        return clockResponse;
    }

    public void setClockResponse(ClockResponse clockResponse) {
        this.clockResponse = clockResponse;
    }

    public GuMobileFrontsResponse getGuMobileFrontsResponse() {
        return guMobileFrontsResponse;
    }

    public void setGuMobileFrontsResponse(GuMobileFrontsResponse guMobileFrontsResponse) {
        this.guMobileFrontsResponse = guMobileFrontsResponse;
    }

    public String getStylesheet() {
        return stylesheet;
    }

    public void setStylesheet(String stylesheet) {
        this.stylesheet = stylesheet;
    }

    
}
