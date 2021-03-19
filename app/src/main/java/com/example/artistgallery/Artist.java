package com.example.artistgallery;

import java.util.ArrayList;

public class Artist {
    String name;
    int imageProfile;
    ArrayList<Integer> imageObra = new ArrayList<>();


    public Artist(String name, int imageProfile, ArrayList<Integer> imageObra) {
        this.name = name;
        this.imageProfile = imageProfile;
        this.imageObra = imageObra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public ArrayList<Integer> getImageObra() {
        return imageObra;
    }

    public void setImageObra(ArrayList<Integer> imageObra) {
        this.imageObra = imageObra;
    }

    @Override
    public String toString() {
        return "\nArtist{" +
                "name='" + name + '\'' +
                ", imageProfile=" + imageProfile +
                ", imageObra=" + imageObra +
                '}';
    }
}
