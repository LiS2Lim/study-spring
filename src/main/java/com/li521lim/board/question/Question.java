package com.li521lim.board.question;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 100)
	private String subject;
	
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	/*
	@Column(nullable = false, columnDefinition = "varchar(100) default '名無し'")
	private String author;
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	*/
	
	@Column
	private LocalDateTime createDate;
	
	public LocalDateTime getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

}
