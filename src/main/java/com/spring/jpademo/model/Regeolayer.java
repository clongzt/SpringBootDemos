package com.spring.jpademo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Regeolayer
 *
 * @author clong
 */

@Configuration
@ConfigurationProperties(prefix = "regeolayer")
public class Regeolayer {
    private String geoCodeUrl;

    private String xzqgeoCodeUrl;

    public String getGeoCodeUrl() {
        return geoCodeUrl;
    }

    public void setGeoCodeUrl(String geoCodeUrl) {
        this.geoCodeUrl = geoCodeUrl;
    }

    public String getXzqgeoCodeUrl() {
        return xzqgeoCodeUrl;
    }

    public void setXzqgeoCodeUrl(String xzqgeoCodeUrl) {
        this.xzqgeoCodeUrl = xzqgeoCodeUrl;
    }
}
