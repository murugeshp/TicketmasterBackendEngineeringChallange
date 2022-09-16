package com.murugesh1996.ticketmasterprogram.entities;

public class Artist {

    int id;
    String name;
    String imgSrc;
    String url;
    int rank;

    public Artist() {}

    public Artist(int id, String name, String imgSrc, String url, int rank) {
        this.id = id;
        this.name = name;
        this.imgSrc = imgSrc;
        this.url = url;
        this.rank = rank;
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

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", url='" + url + '\'' +
                ", rank=" + rank +
                '}';
    }
}
