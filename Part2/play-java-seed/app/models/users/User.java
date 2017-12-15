package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

    public User() {
    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        // List<User> uList = findAll();
        // if(!(uList.size() == 0)) {
        //     for(int i = 0; i < uList.size(); i++) {
        //         if(uList.get(i).email == email) {
        //             if (uList.get(i).password == password) {
        //                 return uList.get(i);
        //             }
        //         }
        //     }
        // }
        // return null;
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }
}