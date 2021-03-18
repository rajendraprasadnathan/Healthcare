package com.example.healthcaregeeks;

public class person
{
    // Variable to store data corresponding
    // to firstname keyword in database
    private String heartrate;

    // Variable to store data corresponding
    // to lastname keyword in database
    private String bodytemperature;

    // Variable to store data corresponding
    // to age keyword in database
    private String odour;
    private String falldetection;

    // Mandatory empty constructor
    // for use of FirebaseUI
    public person() {}

    // Getter and setter method
    public String getHeartrate()
    {
        return heartrate;
    }
    public void setHeartrate(String heartrate)
    {
        this.heartrate = heartrate;
    }
    public String getBodytemperature()
    {
        return bodytemperature;
    }
    public void setBodytemperature(String bodytemperature)
    {
        this.bodytemperature = bodytemperature;
    }
    public String getOdour()
    {
        return odour;
    }
    public void setOdour(String odour)
    {
        this.odour = odour;
    }
    public String getFalldetection()
    {
        return falldetection;
    }
    public void setFalldetection(String falldetection)
    {
        this.falldetection = falldetection;
    }
}