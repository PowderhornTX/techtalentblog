package com.techtalentsouth.techtalentblog.blogpost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//Title
	private String title;
	//Author
	private String author;
	//Post body
	private String blogEntry;
	
	public BlogPost(String title, String author, String blogEntry) {
		super();
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	// For BlogPost to work with JPA ... MUST have an empty constructor
	public BlogPost() {
		super();
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	public Long getId() {
		return id;
	}

}
