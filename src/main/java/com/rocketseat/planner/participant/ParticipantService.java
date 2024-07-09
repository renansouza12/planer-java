package com.rocketseat.planner.participant;

import java.util.UUID;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
    public void registerParticipantToEvent(List<String> participantsToInvite,UUID id){};

    public void triggerConfirmationEmailToParticipant(UUID tripId){};
}
