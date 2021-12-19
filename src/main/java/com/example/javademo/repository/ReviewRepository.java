package com.example.javademo.repository;

import com.example.javademo.domain.Review;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CouchbaseRepository<Review, String> {
    @Query("#{#n1ql.selectEntity} WHERE rate= $1 Order By lastModifiedDate limit 30")
    List<Review> findAllByRateEquals(Integer rate);
}
