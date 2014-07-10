package com.winnersedgeapps.pickem.app.navdrawer;

import android.content.Context;

/**
 * Created by jzehner on 6/3/14.
 */
public class NavMenuItem implements NavDrawerItem {

    public static final int ITEM_TYPE = 1 ;

    private int id ;
    private String label ;

    private NavMenuItem() {
    }

    public static NavMenuItem create( int id, String label) {
        NavMenuItem item = new NavMenuItem();
        item.setId(id);
        item.setLabel(label);
        return item;
    }

    @Override
    public int getType() {
        return ITEM_TYPE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
