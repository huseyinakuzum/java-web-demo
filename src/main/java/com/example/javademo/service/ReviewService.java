package com.example.javademo.service;

import com.example.javademo.domain.Review;
import com.example.javademo.model.CreateReviewRequest;
import com.example.javademo.model.ReviewDTO;
import com.example.javademo.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ReviewDTO findById(String id) {
        ReviewDTO reviewDTO = new ReviewDTO();
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isPresent()) {
            reviewDTO = convertReview(optionalReview.get());
        }
        return reviewDTO;
    }

    public List<ReviewDTO> findByRate(Integer rate) {
        return reviewRepository.findAllByRateEquals(rate).stream()
                .map(this::convertReview)
                .collect(Collectors.toList());
    }

    public String createReview(CreateReviewRequest request) {
        Review review = new Review();
        String id = UUID.randomUUID().toString();
        review.setId(id);
        review.setComment(request.getComment());
        review.setContentId(request.getContentId());
        review.setUserId(request.getUserId());
        review.setUserName(request.getUserName());
        review.setCreateDate(Instant.now().toEpochMilli());
        review.setLastModifiedDate(Instant.now().toEpochMilli());
        reviewRepository.save(review);
        return id;
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
