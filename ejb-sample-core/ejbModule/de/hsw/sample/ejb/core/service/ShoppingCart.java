package de.hsw.sample.ejb.core.service;

import java.util.List;

import javax.ejb.Remote;

import de.hsw.sample.ejb.core.model.Article;

@Remote
public interface ShoppingCart {

	void addArticle(Article article);

	List<Article> getAll();

}