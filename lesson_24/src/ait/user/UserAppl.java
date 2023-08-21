package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("ait_student@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("john@gmx.de");
        user.setPassword("1Da6Fd%08");
        System.out.println(user);


    }
}
