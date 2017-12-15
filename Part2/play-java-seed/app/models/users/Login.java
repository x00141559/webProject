package models.users;

import play.Logger;

public class Login {
    private String email;
    private String password;

    public String validate() {

        if(User.authenticate(email, password) == null) {
            return "Invalid Email or Password";
        }
        return null;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }
}