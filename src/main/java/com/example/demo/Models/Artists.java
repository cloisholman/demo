package com.example.demo.Models;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Artists {

    private String Name;
    private String Hometown;
    private String DOB;
    private String bio;
    private String Movement;


    public Artists(String name, String hometown, String DOB, String bio, String movement) {
        Name = name;
        Hometown = hometown;
        this.DOB = DOB;
        this.bio = bio;
        Movement = movement;
    }

    public Artists(String name){
        Name = name;
    }

    public String getMovement() {
        return Movement;
    }

    public void setMovement(String movement) {
        Movement = movement;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHometown() {
        return Hometown;
    }

    public void setHometown(String hometown) {
        Hometown = hometown;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


}
