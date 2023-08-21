package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private String email = "ait_student@gmail.com";
    private String password = "1234";


    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidEmail(){
        String validEmail = "john@gmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }
    @Test
    void testEmailWithoutAt(){
        String invalidEmail = "john.gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testEmailDoubleAt(){
        String invalidEmail = "jo@hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());

    }
    @Test
    void testEmailDotAfterAt(){
        String invalidEmail = "john@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testEmailLastDot(){
        String invalidEmail = "john@gmxde.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testIncorrectSymbol(){
        String invalidEmail = "j!ohn@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testPasswordNumOfSymbol(){
        String invalidEmail = "1Da6Fd%";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testPasswordSpecialSymbols(){
        String invalidEmail = "1Da6Fd08";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testPasswordUpperCase(){
        String invalidEmail = "1da6fd%08";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testPasswordLowCase(){
        String invalidEmail = "1DA6FD%08";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
    @Test
    void testPasswordDigit(){
        String invalidEmail = "wDa6Fd%Qp";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

}