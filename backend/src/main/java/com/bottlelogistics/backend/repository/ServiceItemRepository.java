package com.bottlelogistics.backend.repository;

import com.bottlelogistics.backend.model.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceItemRepository extends JpaRepository<ServiceItem, Long> {
    List<ServiceItem> findByActiveTrueOrderByDisplayOrderAsc();
}