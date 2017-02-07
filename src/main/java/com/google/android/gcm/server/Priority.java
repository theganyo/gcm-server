package com.google.android.gcm.server;

public enum Priority {
    HIGH,
    NORMAL;

    public String nameLowerCase() {
        return toString().toLowerCase();
    }
}
