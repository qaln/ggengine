package student.examples.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import student.examples.events.GameEventPublisher;
import student.examples.service.GameService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class GameController {

	@Autowired
	private GameService gameService;


	@Autowired
	GameEventPublisher gameEventPublisher;

	@GetMapping("/join/{id}")
	public String joinGame(@PathVariable UUID id) {
		// take an ID of the player
//		gameEventPublisher.publishGameEvent("id = " + id);
		if (gameService.joinGame(id)) {
			return "true";
		} 
		
		return "false";

		// signal the start of a new game into the application
	}

	@GetMapping("/leave")
	public void leaveGame() {
		// take an ID of the player

		// signal the start of a new game into the application
	}

}
