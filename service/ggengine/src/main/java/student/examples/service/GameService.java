package student.examples.service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import student.examples.events.GameEvent;
import student.examples.events.UserEvent;
import student.examples.ggengine.game.Game;
import student.examples.ggengine.game.GameFactory;
import student.examples.ggengine.game.Item;
import student.examples.ggengine.game.Participant;
import student.examples.ggengine.game.ParticipantCollection;
import student.examples.ggengine.game.ParticipantFactory;
import student.examples.ggengine.game.Rock;
import student.examples.ggengine.game.Team;

@Slf4j
@Service
public class GameService {
	private Rock rock;
	private Set<Game> games;

	// TODO this collection should be "filled" with a new participant (Player) each
	// time
	// someone signs in, and also this collection should remove the player that
	// signs off the server.
	private ParticipantCollection allParticipants = new Team();

	@Autowired
	private GameFactory gameFactory;
	@Autowired
	private ParticipantFactory playerFactory;
//	@Autowired
//	private GameEventListener gameEventListener;

	@EventListener
	public void handleGameEvent(GameEvent event) {
		String message = event.getMessage();
		System.out.println(message);
	}

	@EventListener
	public void handleUserEvent(UserEvent event) {
		UUID uuid = UUID.randomUUID();
		Participant player = playerFactory.createParticipant();
		player.setName("John");
		player.setId(uuid);
		allParticipants.add(player);
		System.out.println("Player added; Name = " + player.getName() + " UUID: " + player.getId());
	}

	public GameService() {
		init();
	}

	public Set<Game> getGames() {
		return games;
	}

	public void init() {
		games = new HashSet<>();
		System.out.println("added stuff");
	}

	@Scheduled(fixedRate = 15)
	public void updateFrame() {
		if (games.isEmpty()) {
			return;
		}
//		System.out.println("playing game");
		Game game = games.stream().findFirst().get();
		if (game.getItems() == null) {
//			System.out.println("game has no items");
			return;
		}
		Item item = game.getItems().stream().findFirst().get();
		game.getItems().stream().findFirst().get();
		game.getItems().remove(item);
		game.getItems().add(new Rock(item.getItemType(), item.getSpeedx(), item.getSpeedy(), item.getWidth(),
				item.getHeight(), item.getTop() + 1, item.getLeft(), item.getRotation(), item.getRotationspeed()));
		rock.setTop(rock.getTop() + 1);
	}

	public boolean joinGame(UUID id) {
		if (games.isEmpty()) {
			games.add(gameFactory.createGame());
			return false;
		}

		for (Participant player : allParticipants.getParticipants()) {
			if (player.getId().equals(id)) {

				Game existingGame = games.stream().findFirst().get();
				existingGame.addPlayerToTeam(player, "Team A");
				return true;
			}
		}
		// add new player with id to team a
		return false;
	}

	public void leaveGame() {
		System.out.println("leaving game..");
	}

}
