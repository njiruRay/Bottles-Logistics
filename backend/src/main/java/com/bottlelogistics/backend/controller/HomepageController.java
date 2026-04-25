package com.bottlelogistics.backend.controller;

import com.bottlelogistics.backend.dto.HomepageResponse;
import com.bottlelogistics.backend.service.HomepageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/homepage")
@CrossOrigin(origins = "http://localhost:5173")
public class HomepageController {

    private final HomepageService homepageService;

    public HomepageController(HomepageService homepageService) {
        this.homepageService = homepageService;
    }

    @GetMapping
    public HomepageResponse getHomepageData() {
        return homepageService.getHomepageData();
    }
}