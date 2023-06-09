package ru.itm.mycrud2springboot.service;

import ru.itm.mycrud2springboot.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(long id);

    public void deleteUser(long id);

    public void updateUser(User user);
}
