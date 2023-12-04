package student.examples.ggengine.game;

import java.util.Set;

public interface ParticipantCollection {
	public void add(Participant participant); 
	public void remove(Participant participant);
	public Set<Participant> getParticipants();

}
