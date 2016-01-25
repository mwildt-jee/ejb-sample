package de.hsw.sample.ejb.core.model;

public class Article {

	public String title;
	public String articleNo;
	public String description;
	
	public Article(){}

	public Article(String title, String articleNo, String description) {
		super();
		this.title = title;
		this.articleNo = articleNo;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(String articleNo) {
		this.articleNo = articleNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
