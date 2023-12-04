package student.examples.ggengine.game;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class PlayerFactory implements ParticipantFactory {

	@Override
	public Participant createParticipant(UUID id) {
		return new Player(id);
	}

	@Override
	public Participant createParticipant() {
		return new Player();
	}

}
