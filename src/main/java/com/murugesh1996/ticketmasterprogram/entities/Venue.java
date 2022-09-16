package com.murugesh1996.ticketmasterprogram.entities;

public class Venue {
    int id;
    String name;
    String url;
    String city;

    public Venue() {}

    public Venue(int id, String name, String url, String city) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
