package com.murugesh1996.ticketmasterprogram.entities;

import java.util.Date;

public class EventResponse {
    int id;
    String title;
    String dateStatus;
    String timeZone;
    Date startDate;
    Venue venue;

    public EventResponse(int id, String title, String dateStatus, String timeZone, Date startDate, Venue venue) {
        this.id = id;
        this.title = title;
        this.dateStatus = dateStatus;
        this.timeZone = timeZone;
        this.startDate = startDate;
        this.venue = venue;
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

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
