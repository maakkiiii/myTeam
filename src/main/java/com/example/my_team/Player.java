package com.example.my_team;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Player {
    @Id
    private int id;
    private String surname;
    private String name;
    private String url;
    private String nationality;
    private int size;
    private Date birthdate;
    private int worth;
    private String club;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public int getWorth() {
        return worth;
    }
    public void setWorth(int worth) {
        this.worth = worth;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
}
