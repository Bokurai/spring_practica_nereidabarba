package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

    @JsonProperty("originator")
    public Originator originator;

    @JsonProperty("content")
    public String content;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Root{" +
                "originator=" + originator +
                ", content='" + content + '\'' +
                '}';
    }
}
