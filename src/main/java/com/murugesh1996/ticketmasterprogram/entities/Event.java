package com.murugesh1996.ticketmasterprogram.entities;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Event {
    int id;
    String title;
    String dateStatus;
    String timeZone;

    Date startDate;
    Artist[] artists;

    Venue venue;

    public Event(){}

    public Event(int id, String title, String dateStatus, String timeZone, Date startDate, Artist[] artists) {
        this.id = id;
        this.title = title;
        this.dateStatus = dateStatus;
        this.timeZone = timeZone;
        this.startDate = startDate;
        this.artists = artists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(String dateStatus) {
        this.dateStatus = dateStatus;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateStatus='" + dateStatus + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", startDate='" + startDate + '\'' +
                ", artists=" + Arrays.toString(artists) +
                '}';
    }
}
