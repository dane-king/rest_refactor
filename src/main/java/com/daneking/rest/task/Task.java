package com.daneking.rest.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@Entity
public class Task {
    @Id
    private String id;

    private String title;

    private boolean completeFlag;

    @JoinTable(name="User")
    @JoinColumn(name="id")
    private String assignedUser;

    private Date dateCreated;

    private Date dateUpdated;


    public Task(String assignedUser) {
        this.assignedUser = assignedUser;
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
