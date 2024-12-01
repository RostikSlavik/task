package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Steve", "Fernandez", (byte) 27);
        userService.saveUser("Joseph", "Hunt", (byte) 51);
        userService.saveUser("Angela", "Brooks", (byte) 22);
        userService.saveUser("Stephen", "Smith", (byte) 35);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
