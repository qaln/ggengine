package student.examples.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import lombok.experimental.NonFinal;

@Component
public class GameEventPublisher {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void publishGameEvent(final String id) {
		System.out.println("Publishing custom event. ");
		GameEvent gameEvent = new GameEvent(this, id);
		applicationEventPublisher.publishEvent(gameEvent);
	}

	public void publishGameEvent() {
		System.out.println("Publishing custom event. ");
		GameEvent gameEvent = new GameEvent(this, "Event: Game Created");
		applicationEventPublisher.publishEvent(gameEvent);
	}
}
