package student.examples.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import student.examples.service.GameService;

@Component
public class GameEventListener implements ApplicationListener<GameEvent> {

		

    @Override
    public void onApplicationEvent(GameEvent event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }
}
