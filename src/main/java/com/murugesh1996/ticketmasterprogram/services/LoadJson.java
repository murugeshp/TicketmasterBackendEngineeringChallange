package com.murugesh1996.ticketmasterprogram.services;

import com.murugesh1996.ticketmasterprogram.entities.Artist;
import com.murugesh1996.ticketmasterprogram.entities.Event;
import com.murugesh1996.ticketmasterprogram.entities.Venue;
import com.murugesh1996.ticketmasterprogram.exceptionhandling.ArtistNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class LoadJson {

    @Autowired
    RestTemplate restTemplate;

    List<Artist> artists;

    List<Venue> venues;

    List<Event> events;

    @PostConstruct
    public void init() throws ArtistNotFoundException {
        loadArtist();
        loadVenue();
        loadEvent();
    }

    public void loadArtist(){
        ResponseEntity<List<Artist>> artistResponse =
                restTemplate.exchange("https://iccp-interview-data.s3-eu-west-1.amazonaws.com/78656681/artists.json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Artist>>(){});
        artists = artistResponse.getBody();
    }

    public void loadVenue(){
        ResponseEntity<List<Venue>> venueResponse =
                restTemplate.exchange("https://iccp-interview-data.s3-eu-west-1.amazonaws.com/78656681/venues.json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Venue>>(){});
        venues = venueResponse.getBody();
    }

    public void loadEvent(){
        ResponseEntity<List<Event>> eventResponse =
                restTemplate.exchange("https://iccp-interview-data.s3-eu-west-1.amazonaws.com/78656681/events.json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Event>>(){});
        events = eventResponse.getBody();
    }
}
