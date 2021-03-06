package com.cgsj.workorder.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Envelope {
    public Body getBody() {
        return this.Body;
    }

    public void setBody(Body Body) {
        this.Body = Body;
    }

    @JacksonXmlProperty
    Body Body;

    public String gets() {
        return this.s;
    }

    public void sets(String s) {
        this.s = s;
    }

    String s;

    public String gettext() {
        return this.text;
    }

    public void settext(String text) {
        this.text = text;
    }

    String text;

    public List<Table> getWorkOrderList() {
        return this.getBody().getGetDjListPageResponse().getGetDjListPageResult().getData().getdiffgram().getNewDataSet().getTable();
    }
}
