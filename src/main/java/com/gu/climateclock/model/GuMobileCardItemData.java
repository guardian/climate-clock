package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuMobileCardItemData {
    
    public String title;

    public Date webPublicationDate;

    public String lastModified;

    public GuMobileItemLinkData links;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(Date webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public GuMobileItemLinkData getLinks() {
        return links;
    }

    public void setLinks(GuMobileItemLinkData links) {
        this.links = links;
    }

    @JsonIgnore
    public String getMachineDate() {
        return machineDateFormat.format(webPublicationDate);
    }

    @JsonIgnore
    public String getHumanDate() {
        return humanDateFormat.format(webPublicationDate);
    }

    private static final DateFormat machineDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.UK);
    private static final DateFormat humanDateFormat = SimpleDateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
}
