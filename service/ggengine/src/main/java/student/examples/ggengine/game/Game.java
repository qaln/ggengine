package student.examples.ggengine.game;

import java.util.Set;
import java.util.UUID;

public abstract class Game {

	Set<Item>items; 
	UUID id;
	
	public Set<Item> getItems() {
		return items;
	}
	
	public UUID getId() {
		return id;
	}
	
	public abstract void addPlayerToTeam(Participant player, String teamName);
	
}
