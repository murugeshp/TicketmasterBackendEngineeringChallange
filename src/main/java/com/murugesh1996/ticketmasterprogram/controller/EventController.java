package com.murugesh1996.ticketmasterprogram.controller;

import com.murugesh1996.ticketmasterprogram.entities.ArtistResponse;
import com.murugesh1996.ticketmasterprogram.exceptionhandling.ArtistNotFoundException;
import com.murugesh1996.ticketmasterprogram.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class EventController {

    @Autowired
    ArtistService artistService;

    @GetMapping(path = "/{id}")
    public ArtistResponse getArtist(@PathVariable int id){
        ArtistResponse artistResponse =  artistService.getArtistInfo(id);
        if(artistResponse == null){
            throw  new ArtistNotFoundException("Artist not Found");
        }
        return artistResponse;
    }
}
