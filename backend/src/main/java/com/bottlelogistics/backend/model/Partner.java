package com.bottlelogistics.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "partners")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String logoUrl;
    private String websiteUrl;
    private Integer displayOrder;
    private Boolean active;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getLogoUrl() { return logoUrl; }
    public String getWebsiteUrl() { return websiteUrl; }
    public Integer getDisplayOrder() { return displayOrder; }
    public Boolean getActive() { return active; }
}