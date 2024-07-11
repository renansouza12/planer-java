package com.rocketseat.planner.participant;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    @Autowired
    ParticipantRepository repository;

    @PostMapping("/{id}/confirm")
    public ResponseEntity<Participant> confirmParticipants(@PathVariable UUID id,@RequestBody ParticipantRequestDTO payload){
          Optional<Participant> participants =   this.repository.findById(id);


          if(participants.isPresent()){
            Participant rawParticipant = participants.get();
            rawParticipant.setIsConfirmed(true);
            rawParticipant.setName(payload.name());

            this.repository.save(rawParticipant);

            return ResponseEntity.ok(rawParticipant);
          }

          return ResponseEntity.notFound().build();
    }

}