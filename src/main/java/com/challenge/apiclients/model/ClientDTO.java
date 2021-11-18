package com.challenge.apiclients.model;


import java.util.Date;

public class ClientDTO {
    private String name;
    private String lastName;
    private Date birthDate;

    public ClientDTO(String name, String lastName, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
