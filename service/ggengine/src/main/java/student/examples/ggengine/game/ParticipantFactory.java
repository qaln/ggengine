package student.examples.ggengine.game;

import java.util.UUID;

public interface ParticipantFactory {
	public Participant createParticipant();

	public Participant createParticipant(UUID id);

}
