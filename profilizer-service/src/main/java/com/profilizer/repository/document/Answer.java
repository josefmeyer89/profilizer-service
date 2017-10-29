package com.profilizer.repository.document;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "personality_test_answers")
public class Answer {

	@Id
	@Indexed
	private String id;
	@NotBlank
	private String question;
	@NotBlank
	private String answer;
	@Field(value = "creation_date")
	private Date creationDate;
	@NotBlank
	private String personalityTestId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getPersonalityTestId() {
		return personalityTestId;
	}

	public void setPersonalityTestId(String personalityTestId) {
		this.personalityTestId = personalityTestId;
	}
}