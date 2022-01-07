package com.example.javademo.domain;

//@Entity
public class Review {
//
//    @Id
//    @SequenceGenerator(name = "review_seq", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_seq")
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "user_id")
//    Long userId;
//
//    @Column(name = "content_id")
//    String contentId;
//
//    @Column(name = "rate")
//    Integer rate;
//
//    @Column(name = "comment")
//    String comment;
//
//    @Column(name = "username")
//    String userName;
//
//    @Column(name = "review_status")
//    String reviewStatus;
//
//    @Column(name = "deleted", columnDefinition = "Bit(1) default false")
//    private boolean deleted = false;
//
//    @CreatedDate
//    @Column(name = "created_date", nullable = false, updatable = false)
//    Date createDate;
//
//    @LastModifiedDate
//    @Column(name = "last_modified_date")
//    Date lastModifiedDate;
//
//
//    @PrePersist
//    protected void prePersist() {
//        if (this.createDate == null) createDate = new Date();
//        if (this.lastModifiedDate == null) lastModifiedDate = new Date();
//    }
//
//    @PreUpdate
//    protected void preUpdate() {
//        this.lastModifiedDate = new Date();
//    }
//
//    @PreRemove
//    protected void preRemove() {
//        this.lastModifiedDate = new Date();
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getContentId() {
//        return contentId;
//    }
//
//    public void setContentId(String contentId) {
//        this.contentId = contentId;
//    }
//
//    public Integer getRate() {
//        return rate;
//    }
//
//    public void setRate(Integer rate) {
//        this.rate = rate;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getReviewStatus() {
//        return reviewStatus;
//    }
//
//    public void setReviewStatus(String reviewStatus) {
//        this.reviewStatus = reviewStatus;
//    }
//
//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public Date getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(Date lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public boolean isDeleted() {
//        return deleted;
//    }
//
//    public void setDeleted(boolean deleted) {
//        this.deleted = deleted;
//    }
}
