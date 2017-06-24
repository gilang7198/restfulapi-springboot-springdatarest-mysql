package com.hellokoding.restfulapi.model;

import javax.persistence.*;

@Entity
public class Book{
    private int id;
    private String name;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
