package student.examples.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import lombok.experimental.NonFinal;

@Component
public class UserEventPublisher {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void publishUserEvent(final String id) {
		System.out.println("Publishing custom event. ");
		UserEvent userEvent = new UserEvent(this, id);
		applicationEventPublisher.publishEvent(userEvent);

	}

	public void publishUserEvent() {
		System.out.println("Publishing custom event. ");
		UserEvent userEvent = new UserEvent(this, "Event: user event");
		applicationEventPublisher.publishEvent(userEvent);
	}
}
