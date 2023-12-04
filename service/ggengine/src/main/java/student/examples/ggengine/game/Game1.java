package student.examples.ggengine.game;

import java.util.HashSet;
import java.util.Set;

public class Game1 {
	private GameState gameState = GameState.PENDING;
	public Game1() {
		items = new HashSet<Item>();
//		items.add(new Rock(ItemType.ROCK, 0, 0, 0, 0, 0, 0, 0, 0));
	}
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	private Set<Item>items;
	
    
}
