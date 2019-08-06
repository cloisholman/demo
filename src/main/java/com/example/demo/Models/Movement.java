package com.example.demo.Models;

public class Movement {
    private String movementName;
    private String timePeriod;
    private String artistName;
    private String Description;

    public String getMovementName() {
        return movementName;
    }

    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Movement(String movementName, String timePeriod, String artistName, String description) {
        this.movementName = movementName;
        this.timePeriod = timePeriod;
        this.artistName = artistName;
        Description = description;
    }
//todo: change String artistName to an array list
}
