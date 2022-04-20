package br.com.cod3r.bridge.mvc.dao;

import br.com.cod3r.bridge.mvc.model.User;

public class UserMongoDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
