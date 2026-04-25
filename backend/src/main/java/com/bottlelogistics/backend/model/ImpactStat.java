package com.bottlelogistics.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "impact_stats")
public class ImpactStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String value;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;
    private Integer displayOrder;
    private Boolean active;

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getValue() { return value; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public Integer getDisplayOrder() { return displayOrder; }
    public Boolean getActive() { return active; }
}