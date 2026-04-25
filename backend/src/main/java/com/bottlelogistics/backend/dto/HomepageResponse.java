package com.bottlelogistics.backend.dto;

import com.bottlelogistics.backend.model.*;

import java.util.List;

public class HomepageResponse {

    private final List<HomepageSection> sections;
    private final List<ServiceItem> services;
    private final List<Product> products;
    private final List<CollectionPoint> collectionPoints;
    private final List<ImpactStat> socialStats;
    private final List<ImpactStat> environmentalStats;
    private final List<Partner> partners;

    public HomepageResponse(
            List<HomepageSection> sections,
            List<ServiceItem> services,
            List<Product> products,
            List<CollectionPoint> collectionPoints,
            List<ImpactStat> socialStats,
            List<ImpactStat> environmentalStats,
            List<Partner> partners
    ) {
        this.sections = sections;
        this.services = services;
        this.products = products;
        this.collectionPoints = collectionPoints;
        this.socialStats = socialStats;
        this.environmentalStats = environmentalStats;
        this.partners = partners;
    }

    public List<HomepageSection> getSections() {
        return sections;
    }

    public List<ServiceItem> getServices() {
        return services;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<CollectionPoint> getCollectionPoints() {
        return collectionPoints;
    }

    public List<ImpactStat> getSocialStats() {
        return socialStats;
    }

    public List<ImpactStat> getEnvironmentalStats() {
        return environmentalStats;
    }

    public List<Partner> getPartners() {
        return partners;
    }
}