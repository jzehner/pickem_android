package com.winnersedgeapps.pickem.app.models;

import com.google.gson.annotations.Expose;

/**
 * Created by jzehner on 6/17/14.
 */
public class Pool {
    @Expose
    private String _id;
    @Expose
    private String homeName;
    @Expose
    private String name;
    @Expose
    private String visitorName;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }
}
