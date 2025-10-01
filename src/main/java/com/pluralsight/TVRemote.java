package com.pluralsight;

public class TVRemote {

    // remote vars
    private String manufacturer;
    private int currentChannel;
    private int currentVolume;
    private boolean powerOn;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    //Constructor
    public TVRemote(String manufacturerName){
        this.manufacturer = manufacturerName;
        this.currentChannel = 1; //Starting channel
        this.currentVolume = 10; //starting volume
        this.powerOn = false; //TV starts on off
    }

}
