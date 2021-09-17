package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuMobileCardData {
    public GuMobileCardItemData item;

    public GuMobileCardItemData getItem() {
        return item;
    }

    public void setItem(GuMobileCardItemData item) {
        this.item = item;
    }

    
}
