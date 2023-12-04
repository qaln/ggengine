package student.examples.ggengine.game;

import java.util.UUID;

public interface Participant {
	public UUID getId(); 
	public String getName();
	public void setName(String string);
	void setId(UUID id);
}
