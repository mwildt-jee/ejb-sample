package de.hsw.sample.ejb.core.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import de.hsw.sample.ejb.core.model.Article;

@Stateless
public class ArticleServiceHashMapImpl implements ArticleService {

	public Map<String, Article> articles = new HashMap<String, Article>(); 
	
	/**
	 * Die Initialisierung muss erfolgen, nachdem die Abhängigkeiten durch den Container aufgelöst wurden.
	 */
	@PostConstruct
	public void init(){
		this.addArticle(new Article("Buch", "art001", "Ein gutes Buch"));
		this.addArticle(new Article("Tasse", "art002", "Eine Tasse ohne Henkel aber dafür mit Aufdruck"));
	}

	@Override
	public void addArticle(Article article) {
		this.articles.put(article.getArticleNo(), article);
	}

	@Override
	public List<Article> getAllArticles() {
		System.out.println("list articles");
		return new ArrayList<Article>(articles.values());
	}
	
	public Article getArticleByArticleNo(String articleNo){
		return this.articles.get(articleNo);
	}
	
}
