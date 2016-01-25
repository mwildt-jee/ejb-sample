package de.hsw.sample.ejb.core.service;

import java.util.List;

import javax.ejb.Remote;

import de.hsw.sample.ejb.core.model.Article;

@Remote
public interface ArticleService {

	void addArticle(Article article);
	
	List<Article> getAllArticles();
	
	Article getArticleByArticleNo(String articleNo);
	
}
