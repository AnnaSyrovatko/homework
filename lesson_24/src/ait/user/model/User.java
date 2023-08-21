package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (emailIsValid(email)){
            this.email = email;
        }else{
            System.out.println(email + " is not valid"); //null
        }
    }

    private boolean emailIsValid(String email) {
        int at = email.indexOf('@');
        if (at == -1 || email.lastIndexOf('@') != at) {
            return false;
        }
        if(email.indexOf('.',at + 1 ) == -1){
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2){
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')){
                return false;
            }
        }
        return true;
    }

    /*
    TODO Homework
    1) Min 8 symbols
    2) min one symbol in UpperCase
    3) min one symbol in LowCase
    4) Min one symbol is digit
    5) Min one symbol is special symbol ( '!' '%' '@' '&' '*')
     */

    public void setPassword(String password) {
        if (passwordIsValid(password)){
            this.password = password;
        }else{
            System.out.println(password + " is not valid");
        }

    }

    private boolean passwordIsValid(String password) {
        int counter = 0;

        if (password.length() >= 8){
            counter ++;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == password.toUpperCase().charAt(i)){
                counter ++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == password.toLowerCase().charAt(i)){
                counter ++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                counter ++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == '!' ||c == '%' ||c == '@' ||c == '*' ||c == '&'){
                counter ++;
                break;
            }
        }
        return (counter == 5);
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
