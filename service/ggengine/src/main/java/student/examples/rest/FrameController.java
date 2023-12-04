package student.examples.rest;

import java.util.HashSet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import student.examples.ggengine.conn.Frame;
import student.examples.ggengine.game.Item;
import student.examples.service.GameService;

@RestController
public class FrameController {
	private final GameService gameService;

//	 TODO optimize
	FrameController(GameService gameService) {
		this.gameService = gameService;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/update")
	@PostMapping("/update")
	public Frame getData() {
		Frame frame = new Frame(0, gameService.getGames()
				.stream().findFirst().get().getItems());
		return frame;
	}

}