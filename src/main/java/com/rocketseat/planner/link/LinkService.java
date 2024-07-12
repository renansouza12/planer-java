package com.rocketseat.planner.link;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

@Service
public class LinkService {

    @Autowired
    LinkRepository repository;

    public LinkResponse registerLink(LinkRequestDTO payload, Trip trip) {
        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    public List<LinkDataDTO> getAllLinksFromTrip(UUID tripId) {

        return this.repository.findByTripId(tripId).stream()
                .map(l -> new LinkDataDTO(l.getId(), l.getTitle(), l.getUrl())).toList();
    }
}
