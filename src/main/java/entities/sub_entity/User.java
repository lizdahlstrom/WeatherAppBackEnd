package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Liz on 2017-02-09.
 */

@Entity
@Table(name = "user")
public class User extends CoreEntity {

    @Column(name = "username")
    private String name;
    @Column(name = "password")
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
