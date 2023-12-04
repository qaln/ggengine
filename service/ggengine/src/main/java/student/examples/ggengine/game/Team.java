package student.examples.ggengine.game;

import java.util.HashSet;
import java.util.Set;

public class Team implements ParticipantCollection {

	private Set<Participant> players;
	@Override
	public void add(Participant participant) {
		players.add(participant);
		
	}

	@Override
	public void remove(Participant participant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Participant> getParticipants() {
		return players;
	}
	
	public Team() {
		players = new HashSet();
	}

}
