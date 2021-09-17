package com.gu.climateclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuMobileItemLinkData {
    public String uri;
    public String shortUrl;
    public String relatedUri;
    public String webUri;
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getShortUrl() {
        return shortUrl;
    }
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
    public String getRelatedUri() {
        return relatedUri;
    }
    public void setRelatedUri(String relatedUri) {
        this.relatedUri = relatedUri;
    }
    public String getWebUri() {
        return webUri;
    }
    public void setWebUri(String webUri) {
        this.webUri = webUri;
    }

    
}
