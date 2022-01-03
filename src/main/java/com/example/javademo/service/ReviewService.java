package com.example.javademo.service;

import com.example.javademo.domain.Review;
import com.example.javademo.model.CreateReviewRequest;
import com.example.javademo.model.ReviewDTO;
import com.example.javademo.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ReviewDTO findById(Integer id) {
        ReviewDTO reviewDTO = new ReviewDTO();
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isPresent()) {
            reviewDTO = convertReview(optionalReview.get());
        }
        return reviewDTO;
    }

    public Long createReview(CreateReviewRequest request) {
        Review review = new Review();
        review.setComment(request.getComment());
        review.setContentId(request.getContentId());
        review.setUserId(request.getUserId());
        review.setUserName(request.getUserName());
        Review savedReview = reviewRepository.save(review);
        return savedReview.getId();
    }

    private ReviewDTO convertReview(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setId(review.getId());
        reviewDTO.setComment(review.getComment());
        reviewDTO.setRate(review.getRate());
        reviewDTO.setContentId(review.getContentId());
        reviewDTO.setUserId(review.getUserId());
        reviewDTO.setUserName(review.getUserName());
        return reviewDTO;
    }

}
