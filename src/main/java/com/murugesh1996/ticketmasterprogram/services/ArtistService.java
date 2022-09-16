package com.murugesh1996.ticketmasterprogram.services;

import com.murugesh1996.ticketmasterprogram.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    LoadJson loadJson;

    public ArtistResponse getArtistInfo(int id){
        ArtistResponse artistResponse = null;
        Optional<Artist> artist = loadJson.artists.stream().filter(artist1 -> artist1.getId()==id).findFirst();
        if(artist.isPresent()){

            artistResponse = new ArtistResponse();
            List<EventResponse> eventResponseListList = new ArrayList<>();

            artistResponse.setId(artist.get().getId());
            artistResponse.setName(artist.get().getName());
            artistResponse.setImgSrc(artist.get().getImgSrc());
            artistResponse.setUrl(artist.get().getUrl());
            artistResponse.setRank(artist.get().getRank());
            for (Event event : loadJson.events){
                for (Artist artist1 : event.getArtists()){
                    if(artist1.getId() == id){
                        eventResponseListList.add(new EventResponse(event.getId(),event.getTitle(),event.getDateStatus(),event.getTimeZone(),event.getStartDate(),getVenue(event.getVenue().getId())));
                        break;
                    }
                }
            }
            artistResponse.setEvents(eventResponseListList);
        }
        return artistResponse;
    }

    private Venue getVenue(int id) {
        return loadJson.venues.stream().filter(venue -> venue.getId()==id).findFirst().get();
    }
}
