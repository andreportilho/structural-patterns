package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.model.User;

public class UserEJB {

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}
