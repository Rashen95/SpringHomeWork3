package ru.geekbrains.SpringHomeWork3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDB userDB;

    public UserService(UserDB userDB) {
        this.userDB = userDB;
    }

    public List<User> getAllUsers() {
        return userDB.getUsers();
    }

    public String getUser(int id) {
        User user = userDB.getUsers().stream().filter(t -> t.getId() == id).findFirst().orElse(null);
        return user == null ? "Пользователь с данным id не найден" : user.toString();
    }

    public String addNewUser(User user) {
        userDB.getUsers().add(user);
        return user.toString();
    }

    public String changeUser(int id, User user) {
        User u = userDB.getUsers().stream().filter(t -> t.getId() == id).findFirst().orElse(null);
        if (u != null) {
            u.setFirstName(user.getFirstName());
            u.setLastName(user.getLastName());
            u.setAge(user.getAge());
            u.setEmail(user.getEmail());
            u.setPhoneNumber(user.getPhoneNumber());
            return u.toString();
        } else {
            return "Пользователь с данным id не найден";
        }
    }

    public String deleteUser(int id) {
        User u = userDB.getUsers().stream().filter(t -> t.getId() == id).findFirst().orElse(null);
        if (u != null) {
            userDB.getUsers().remove(u);
            return String.format("Пользователь с id = %s удален", id);
        } else {
            return "Пользователь с данным id не найден";
        }
    }
}