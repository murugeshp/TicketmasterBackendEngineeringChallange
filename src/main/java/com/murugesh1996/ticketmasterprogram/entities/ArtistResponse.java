package com.murugesh1996.ticketmasterprogram.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ArtistResponse {

    int id;
    String name;
    String imgSrc;
    String url;
    int rank;
    List<EventResponse> events;

    public ArtistResponse(){}

    public ArtistResponse(int id, String name, String imgSrc, String url, int rank, List<EventResponse> events) {
        this.id = id;
        this.name = name;
        this.imgSrc = imgSrc;
        this.url = url;
        this.rank = rank;
        this.events = events;
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

    public List<EventResponse> getEvents() {
        return events;
    }

    public void setEvents(List<EventResponse> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "ArtistResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", url='" + url + '\'' +
                ", rank=" + rank +
                ", events=" + events +
                '}';
    }
}
