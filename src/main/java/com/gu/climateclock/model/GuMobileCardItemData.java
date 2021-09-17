package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuMobileCardItemData {
    
    public String title;

    public String webPublicationDate;

    public String lastModified;

    public GuMobileItemLinkData links;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
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

    
}
