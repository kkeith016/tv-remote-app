package com.pluralsight;

public class TVRemote {

    // remote
    private String manufacturer;
    private int currentChannel;
    private int currentVolume;
    private boolean powerOn;

    //Constructor
    public TVRemote(String manufacturerName){
        this.manufacturer = manufacturerName;
        this.currentChannel = 1; //Starting channel
        this.currentVolume = 10; //starting volume
        this.powerOn = false; //TV starts on off
    }

    //overloaded Constructor specifying manufacture starting channel and starting volume
     TVRemote(String manufacturerName, int startChannel, int startVolume) {
         this.manufacturer = manufacturerName;
         this.currentChannel = startChannel;
         this.currentVolume = startVolume;
         this.powerOn = false;
     }

    //Methods
    //Power on and off.

    public void turnOn(){
        this.powerOn = true;
        System.out.println(manufacturer + " Tv is now ON");
    }

    public void turnOff(){
        this.powerOn = false;
        System.out.println(manufacturer + " Tv is now OFF");
    }

    //Changing the channel
    public void changeChannel(int newChannel){
        this.currentChannel = newChannel;
        System.out.println("Tv channel changed to " + newChannel);
    }

    //Volume
    public void adjustVolume(int newVolume){
        currentVolume = newVolume;
        System.out.println("Tv volume adjusted to " + newVolume);
    }



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


}
