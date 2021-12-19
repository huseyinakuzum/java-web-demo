package com.example.javademo.controller;

import com.example.javademo.model.CreateReviewRequest;
import com.example.javademo.model.ReviewDTO;
import com.example.javademo.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/id/{reviewId}")
    public ReviewDTO getReview(@PathVariable String reviewId) {
        return reviewService.findById(reviewId);
    }

    @GetMapping("/rate/{rate}")
    public List<ReviewDTO> findByRate(@PathVariable Integer rate) {
        return reviewService.findByRate(rate);
    }

    @PostMapping
    public String createReview(@RequestBody CreateReviewRequest request) {
        return reviewService.createReview(request);
    }
}
