package com.daneking.rest.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@Entity
public class User {
    @Id
    private String id;

    private String nick;

    private String password;

    private String name;

    private Date dateCreated;

    private Date dateUpdated;

    public User(String id) {
        this.id = id;
    }

    @PrePersist
    protected void onCreate(){
        dateCreated=new Date();
    }
    @PreUpdate
    protected  void onUpdate(){
        dateUpdated=new Date();
    }
}
