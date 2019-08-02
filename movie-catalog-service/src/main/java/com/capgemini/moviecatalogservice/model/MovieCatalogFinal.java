package com.capgemini.moviecatalogservice.model;

import java.util.List;

public class MovieCatalogFinal {

	private List<CatalogItem> catalogItems;

	public MovieCatalogFinal(List<CatalogItem> catalogItems) {
		super();
		this.catalogItems = catalogItems;
	}

	public MovieCatalogFinal() {
		super();
	}

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<CatalogItem> catalogItems) {
		this.catalogItems = catalogItems;
	}

	@Override
	public String toString() {
		return "MovieCatalogFinal [catalogItems=" + catalogItems + "]";
	}
	
}
