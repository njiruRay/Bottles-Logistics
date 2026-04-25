package com.bottlelogistics.backend.repository;

import com.bottlelogistics.backend.model.HomepageSection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomepageSectionRepository extends JpaRepository<HomepageSection, Long> {
    List<HomepageSection> findByActiveTrueOrderByDisplayOrderAsc();
}