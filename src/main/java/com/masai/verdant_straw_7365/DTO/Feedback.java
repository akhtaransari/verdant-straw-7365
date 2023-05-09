package com.masai.verdant_straw_7365.DTO;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Feedback {
	@Id
	private String feedbackId;
	private String feedback;
	private int rating;
	private LocalDate submitDate;
	
	
	public Feedback() {
		super();
	}
	

	public Feedback(String feedbackId, String feedback, int rating, LocalDate submitDate) {
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
		this.rating = rating;
		this.submitDate = submitDate;
	}


	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", feedback=" + feedback + ", rating=" + rating + ", submitDate="
				+ submitDate + "]";
	}


	public String getFeedbackId() {
		return feedbackId;
	}


	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public LocalDate getSubmitDate() {
		return submitDate;
	}


	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	
	
	
}
