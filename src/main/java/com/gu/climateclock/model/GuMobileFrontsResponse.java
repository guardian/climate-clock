package com.gu.climateclock.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuMobileFrontsResponse {

    public List<GuMobileCardData> cards;

    public List<GuMobileCardData> getCards() {
        return cards;
    }

    public void setCards(List<GuMobileCardData> cards) {
        this.cards = cards;
    }
    
    
    
}
