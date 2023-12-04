package student.examples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.examples.events.UserEventPublisher;

@Service
public class AuthService {

	@Autowired
	UserEventPublisher userEventPublisher;

	// TODO task 5.3 for more details
	public void signin(String userName, String userPassword) {
		// fire event UserEvent with some kind of type that says signed injjkj
		if (userName.equals("user") && userPassword.equals("user")) {
			userEventPublisher.publishUserEvent("signed in");
		}
		
	}
	
	public void signout() {
		
	}
}



















