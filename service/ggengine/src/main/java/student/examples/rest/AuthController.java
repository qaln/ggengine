package student.examples.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import student.examples.service.AuthService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {


	@Autowired
	private AuthService authService;



	@PostMapping("/signin")
	public String signin(String userName, String userPassword) {
		System.out.println("username = " + userName);
		System.out.println("password = " + userPassword);
		authService.signin(userName, userPassword);
		return "sigin in";
	}

	@PostMapping("/signout")
	public String signout() {
		return "signout";
	}

}
