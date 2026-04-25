package com.bottlelogistics.backend.repository;

import com.bottlelogistics.backend.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
    List<Partner> findByActiveTrueOrderByDisplayOrderAsc();
}