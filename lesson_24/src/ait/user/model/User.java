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
        email = email.trim();
        if (emailIsValid(email)){
            this.email = email;
        }else{
            System.out.println(email + " is not valid"); //null
        }
    }

    private boolean emailIsValid(String email) {
        String[] arr = email.split("");
        int at = findIndex(arr, "@", 0);
        int dot = findIndex(arr, ".", 0);

        if (at == -1 || findIndex(arr, "@", at+1) != -1) {
            return false;
        }
        if( findIndex(arr, ".", at+1) == -1){
            return false;
        }
        if (dot >= arr.length - 2){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            char c = str.charAt(0);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')){
                return false;
            }
        }
        return true;
    }

    private int findIndex(String[] arr, String element, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void setPassword(String password) {
        if (passwordIsValid(password)){
            this.password = password;
        }else{
            System.out.println(password + " is not valid");
        }

    }

    private boolean passwordIsValid(String password) {
        boolean [] res = new boolean[5];
        String[] arr = password.split("");

       if (arr.length >= 8){
           res[0] = true;
       }

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            char c = str.charAt(0);
            if (Character.isAlphabetic(str.charAt(0)) && str.equals(str.toUpperCase())){
                res[1] = true;
            }
            if (Character.isAlphabetic(str.charAt(0)) && str.equals(str.toLowerCase())){
                res[2] = true;
            }
            if (Character.isDigit(str.charAt(0))){
                res[3] = true;
            }
            if (c == '!' ||c == '%' ||c == '@' ||c == '*' ||c == '&'){
                res[4] = true;
            }
       }
        return (res[0] && res[1] && res[2] && res[3] && res[4]);
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
