package com.bottlelogistics.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "collection_points")
public class CollectionPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String locationName;

    @Column(columnDefinition = "TEXT")
    private String address;

    private String phone;
    private Integer displayOrder;
    private Boolean active;

    public Long getId() { return id; }
    public String getCity() { return city; }
    public String getLocationName() { return locationName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public Integer getDisplayOrder() { return displayOrder; }
    public Boolean getActive() { return active; }
}