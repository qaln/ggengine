package student.examples.ggengine.game;

import java.util.UUID;

public class Player implements Participant {

	private UUID id;
	private String name;
	
	public Player(UUID id) {
		this.id = id;
		System.out.println("created player with id = " + id);
	}

	public Player() {
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setId(UUID id) {
		this.id = id;
	}

}
