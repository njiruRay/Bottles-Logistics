package com.bottlelogistics.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "homepage_sections")
public class HomepageSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sectionKey;
    private String eyebrow;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String subtitle;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String extraDescription;

    private String buttonText;
    private String buttonLink;
    private String imageUrl;
    private Integer displayOrder;
    private Boolean active;

    public Long getId() { return id; }
    public String getSectionKey() { return sectionKey; }
    public String getEyebrow() { return eyebrow; }
    public String getTitle() { return title; }
    public String getSubtitle() { return subtitle; }
    public String getDescription() { return description; }
    public String getExtraDescription() { return extraDescription; }
    public String getButtonText() { return buttonText; }
    public String getButtonLink() { return buttonLink; }
    public String getImageUrl() { return imageUrl; }
    public Integer getDisplayOrder() { return displayOrder; }
    public Boolean getActive() { return active; }
}