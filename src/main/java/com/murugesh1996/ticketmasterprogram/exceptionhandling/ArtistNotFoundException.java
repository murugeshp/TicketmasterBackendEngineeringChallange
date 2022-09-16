package com.murugesh1996.ticketmasterprogram.exceptionhandling;

public class ArtistNotFoundException extends RuntimeException{
    public ArtistNotFoundException(String message) {
        super(message);
    }

    public ArtistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArtistNotFoundException(Throwable cause) {
        super(cause);
    }
}
