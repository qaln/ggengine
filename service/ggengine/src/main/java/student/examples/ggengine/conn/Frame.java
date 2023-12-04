package student.examples.ggengine.conn;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import student.examples.ggengine.game.Item;

// Should be immutable because it already happened
public final class Frame {
//    private Set<Item> items; 
//
//    Frame(HashSet<Item> items) {
//        this.items = items;
//    }
//
//    public Set<Item> getItems() {
//        return Collections.unmodifiableSet(items);
//    }

	private int id;
	public Set<Item> items;

	public Frame(int x, Set<Item> items) {
		this.id = id;
		this.items = items;
	}
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}
    
    
}
