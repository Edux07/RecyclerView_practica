package com.example.recyclerview_practica;

public class Item {
     String name;
    String email;
     int Image;

    public Item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
