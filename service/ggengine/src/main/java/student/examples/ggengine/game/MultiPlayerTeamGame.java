package student.examples.ggengine.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MultiPlayerTeamGame extends Game {

	// uuid and Set<ITem>items already defined

	ParticipantCollection participants;
	Map<String, Team> teams;

	public MultiPlayerTeamGame() {
//		participants = new 
		teams = new HashMap<String, Team>();
		teams.put("Team A", new Team());
		teams.put("Team B", new Team());
	}

	@Override
	public Set<Item> getItems() {
		return super.getItems();
	}

	@Override
	public UUID getId() {
		return super.getId();
	}

	public void addPlayerToTeam(Participant player, String teamName) {
		teams.get(teamName).add(player);
		teams.get(teamName).getParticipants().forEach(participant -> {
			System.out.println(participant.getId());
		});
		System.out.println("Player added to team " + teamName);
	}

}
