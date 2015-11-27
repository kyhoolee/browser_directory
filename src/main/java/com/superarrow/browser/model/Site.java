package com.superarrow.browser.model;

import com.superarrow.browser.util.Utils;

public class Site {
	
	public String url;
	public String title;
	public String cover;
	
	public Site( String cover, String title,String url) {
		super();
		this.url = url;
		this.title = title;
		this.cover = cover;
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
