package com.schoolars.schoolars.entity;

import java.net.URL;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "clubs")
public class Club {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "logo")
    private Data logo;

    @Column(name = "links")
    private URL links;

    public Club() {

    }

    public Club(int id, String name, String description, Data logo, URL links) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.links = links;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Data getLogo() {
        return this.logo;
    }

    public void setLogo(Data logo) {
        this.logo = logo;
    }

    public URL getLinks() {
        return this.links;
    }

    public void setLinks(URL links) {
        this.links = links;
    }


}
