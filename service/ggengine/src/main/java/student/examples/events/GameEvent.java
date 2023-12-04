package student.examples.events;

import org.springframework.context.ApplicationEvent;

public class GameEvent extends ApplicationEvent {
    private String message;

    public GameEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
