package com.example.admin.msure.Model;

/**
 * Created by Admin on 30-01-2018.
 */

public class DataModel
{
    String name;
    int image;

    public DataModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
