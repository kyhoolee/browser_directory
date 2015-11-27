package com.superarrow.browser.model;

import java.util.ArrayList;
import java.util.List;

import com.superarrow.browser.util.Utils;

public class Topic {
	
	public String title;
	public List<Site> siteList;

	public Topic(String title) {
		super();
		this.title = title;
		this.siteList = new ArrayList<Site>();
	}
	
	public String toString() {
		String result = "";
		try {
			result = Utils.toString(this);
		} catch (Exception e) {
			
		}
		return result;
	}

}
