package com.wenhao.designpatterns.v7.observer.springobserver.observable;

import org.json.JSONObject;
import org.springframework.context.ApplicationEvent;

public class OrderCreateEvent extends ApplicationEvent {

    private JSONObject jsonObject;

    public OrderCreateEvent(Object source, JSONObject jsonObject) {
        super(source);
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
