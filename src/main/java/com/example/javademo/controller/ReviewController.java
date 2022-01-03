package com.example.javademo.controller;

import com.example.javademo.model.CreateReviewRequest;
import com.example.javademo.model.ReviewDTO;
import com.example.javademo.service.ReviewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/id/{reviewId}")
    public ReviewDTO getReview(@PathVariable Integer reviewId) {
        return reviewService.findById(reviewId);
    }

    @PostMapping
    public Long createReview(@RequestBody CreateReviewRequest request) {
        return reviewService.createReview(request);
    }
}
