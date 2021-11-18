package com.challenge.apiclients.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="client")
public class Client implements Serializable {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private Date birthDate;

    public Client() {

    }

    public Client(Long id, String name, String lastName, Date birthDate) {
        this.id = id;
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

    public Long getAge() {
        LocalDate today = LocalDate.now();
        LocalDate  birthDateBlah = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return ChronoUnit.YEARS.between(birthDateBlah, today);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
