package entities.sub;

import entities.CoreEntity;

import javax.persistence.Entity;

/**
 * Created by Liz on 2017-02-09.
 */

@Entity
public class User extends CoreEntity {

    private String name;
    private String password;

    public User(long id, String name, String password) {
        super.id = id;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
