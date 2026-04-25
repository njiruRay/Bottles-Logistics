package com.bottlelogistics.backend.service;

import com.bottlelogistics.backend.dto.HomepageResponse;
import com.bottlelogistics.backend.repository.*;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {

    private final HomepageSectionRepository homepageSectionRepository;
    private final ServiceItemRepository serviceItemRepository;
    private final ProductRepository productRepository;
    private final CollectionPointRepository collectionPointRepository;
    private final ImpactStatRepository impactStatRepository;
    private final PartnerRepository partnerRepository;

    public HomepageService(
            HomepageSectionRepository homepageSectionRepository,
            ServiceItemRepository serviceItemRepository,
            ProductRepository productRepository,
            CollectionPointRepository collectionPointRepository,
            ImpactStatRepository impactStatRepository,
            PartnerRepository partnerRepository
    ) {
        this.homepageSectionRepository = homepageSectionRepository;
        this.serviceItemRepository = serviceItemRepository;
        this.productRepository = productRepository;
        this.collectionPointRepository = collectionPointRepository;
        this.impactStatRepository = impactStatRepository;
        this.partnerRepository = partnerRepository;
    }

    public HomepageResponse getHomepageData() {
        return new HomepageResponse(
                homepageSectionRepository.findByActiveTrueOrderByDisplayOrderAsc(),
                serviceItemRepository.findByActiveTrueOrderByDisplayOrderAsc(),
                productRepository.findByActiveTrueOrderByDisplayOrderAsc(),
                collectionPointRepository.findByActiveTrueOrderByDisplayOrderAsc(),
                impactStatRepository.findByCategoryAndActiveTrueOrderByDisplayOrderAsc("social"),
                impactStatRepository.findByCategoryAndActiveTrueOrderByDisplayOrderAsc("environmental"),
                partnerRepository.findByActiveTrueOrderByDisplayOrderAsc()
        );
    }
}