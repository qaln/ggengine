package student.examples.ggengine.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rock extends Item {

	public Rock(ItemType itemType, int speedx, int speedy, int width, int height, int top, int left, int rotation, int rotationspeed) {
		super(itemType, speedx, speedy, width, height, top, left, rotation, rotationspeed);
	}

	public int getTop() {
		return top;
	}


	public void setTop(int top) {
		this.top = top;
	}
	
}
