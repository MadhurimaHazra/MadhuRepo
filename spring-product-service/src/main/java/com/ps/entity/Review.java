package com.ps.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Review")
public class Review {

	
	@Id
	@GeneratedValue
	@Column(name = "reviewId")
	private int reviewId;
	
	@Column(name = "stars")
	private int stars;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "body")
	private String body;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="id")
	private Product product;

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Review(int stars, String author, String body, Product product) {
		super();
		this.stars = stars;
		this.author = author;
		this.body = body;
		this.product = product;
	}

	public Review() {
		super();
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", stars=" + stars + ", author=" + author + ", body=" + body
				+ ", product=" + product + "]";
	}
	
	
	
	
}
