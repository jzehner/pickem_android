package com.winnersedgeapps.pickem.app.navdrawer;

/**
 * Created by jzehner on 6/3/14.
 */
public interface NavDrawerItem {
    public int getId();
    public String getLabel();
    public int getType();
    public boolean isEnabled();
}
