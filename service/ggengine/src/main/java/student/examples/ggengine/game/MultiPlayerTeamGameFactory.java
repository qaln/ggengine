package student.examples.ggengine.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import student.examples.events.GameEventPublisher;

@Component
public class MultiPlayerTeamGameFactory implements GameFactory {

	@Autowired
	GameEventPublisher gameEventPublisher;

	@Override
	public Game createGame() {
		System.out.println("MultiPlayerTeamGame created!");
		gameEventPublisher.publishGameEvent();
		return new MultiPlayerTeamGame();
	}

}