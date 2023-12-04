package student.examples.ggengine.game;
import student.examples.ggengine.game.ItemType;

import lombok.Getter;

@Getter
public abstract class Item {

	public Item(ItemType itemType, int speedx, int speedy, int width, int height, int top, int left, int rotation,
			int rotationspeed) {
		// Protect the type
		this.itemType = itemType;
		this.speedx = speedx;
		this.speedy = speedy;
		this.width = width;
		this.height = height;
		this.top = top;
		this.left = left;
		this.rotation = rotation;
		this.rotationspeed = rotationspeed;
	}

	public int getSpeedx() {
		return speedx;
	}

	public void setSpeedx(int speedx) {
		this.speedx = speedx;
	}

	public int getSpeedy() {
		return speedy;
	}

	public void setSpeedy(int speedy) {
		this.speedy = speedy;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public int getRotationspeed() {
		return rotationspeed;
	}

	public void setRotationspeed(int rotationspeed) {
		this.rotationspeed = rotationspeed;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	protected int speedx;
	protected int speedy;
	protected int width;
	protected int height;

	protected int top;
	protected int left;
	protected int rotation;
	protected int rotationspeed;

	protected ItemType itemType;

}
