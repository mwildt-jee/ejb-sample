package de.hsw.sample.ejb.core.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import de.hsw.sample.ejb.core.model.Article;

@Stateful
public class ShoppingCartListImpl implements ShoppingCart {
	
	private List<Article> articles = new ArrayList<Article>();
	
	public ShoppingCartListImpl(){
		System.out.println("CREATE A NEW SHOPPING CART");
	}
	
	@Override
	public void addArticle(Article article){
		this.articles.add(article);
	}
	
	@Override
	public List<Article> getAll(){
		return this.articles;
	}

}
