package br.com.cod3r.adapter.hexagonal.core.ports;

import br.com.cod3r.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);

    List<User> getAll();
}
