package com.tdd.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by TDD on 2017/3/19.
 */
@Entity
public class Teacher {

    private String name;
    private String title;
    private int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
