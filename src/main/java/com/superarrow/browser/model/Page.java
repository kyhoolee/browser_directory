package com.superarrow.browser.model;

import com.superarrow.browser.util.Utils;

public class Page {
	
	public String url;
	public String title;
	
	public String toString() {
		String result = "";
		try {
			result = Utils.toString(this);
		} catch (Exception e) {
			
		}
		return result;
	}
}
