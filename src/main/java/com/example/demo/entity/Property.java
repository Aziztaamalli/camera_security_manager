package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String owner_name;
    private Integer number_of_cameras;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<Camera> cameras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Integer getNumber_of_cameras() {
        return number_of_cameras;
    }

    public void setNumber_of_cameras(Integer number_of_cameras) {
        this.number_of_cameras = number_of_cameras;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }
}
