package com.microraindrop.demo.properties;

public class Elk {

    private String logstashUrl;
    private String elasticUrl;
    private String kibanaUrl ;

    public String getLogstashUrl() {
        return logstashUrl;
    }

    public void setLogstashUrl(String logstashUrl) {
        this.logstashUrl = logstashUrl;
    }

    public String getElasticUrl() {
        return elasticUrl;
    }

    public void setElasticUrl(String elasticUrl) {
        this.elasticUrl = elasticUrl;
    }

    public String getKibanaUrl() {
        return kibanaUrl;
    }

    public void setKibanaUrl(String kibanaUrl) {
        this.kibanaUrl = kibanaUrl;
    }
}
