package ru.crudboot.kata3_1_2.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Empty name")
    @Size(max = 20, message = "To long name")
    private String name;

    @NotEmpty(message = "Empty surName")
    @Size(max = 20, message = "To long surName")
    private String surName;

    @NotEmpty(message = "Empty email")
    @Email(message = "invalid email")
    private String email;

    public User() {
    }

    public User(String name, String surName, String email) {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
