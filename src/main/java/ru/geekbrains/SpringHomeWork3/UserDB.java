package ru.geekbrains.SpringHomeWork3;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDB {
    private final List<User> users;

    public UserDB() {
        this.users = new ArrayList<>(List.of(
                new User("Артем", "Привалов", 28, "89381134495", "rashen95@mail.ru"),
                new User("Сергей", "Сергеев", 35, "89385555555", "qwer@mail.ru"),
                new User("Марат", "Петров", 48, "89381134444", "csaerqw@mail.ru"),
                new User("Анастасия", "Куц", 23, "89381134433", "vsfdfe@mail.ru"),
                new User("Дмитрий", "Леонидов", 20, "89381134422", "rh4tfwef@mail.ru"),
                new User("Ксения", "Фролова", 36, "89381134415", "fwehfef@mail.ru"),
                new User("Зухра", "Федорова", 38, "89381134482", "fwecerh@mail.ru"),
                new User("Геральт", "Ведьмаков", 22, "89381134425", "rcewhre@mail.ru"),
                new User("Федор", "Дядько", 15, "89381134469", "crehr@mail.ru"),
                new User("Максим", "Дедов", 39, "89381134478", "jtygrtgwew999@mail.ru")
        ));
    }

    public List<User> getUsers() {
        return users;
    }
}