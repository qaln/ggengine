package student.examples.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RockController {
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("rock")
	public Map<String, Integer> getData() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Random random = new Random();


		map.put("top", random.nextInt(90) + 10);
		map.put("left", random.nextInt(90) + 10);
		map.put("width", random.nextInt(100000));
		map.put("height", random.nextInt(100));
		map.put("rotation", random.nextInt(360));
		return map;
		
	}
	@GetMapping("/test1")
	public String test() {
		return "hello";
	}

}
