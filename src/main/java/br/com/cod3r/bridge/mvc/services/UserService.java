package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class UserService {
    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
