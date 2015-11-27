package com.superarrow.browser.model;

import java.util.ArrayList;
import java.util.List;

import com.superarrow.browser.util.Utils;

public class Group {
	
	public String title;
	
	public String cover;
	
	public List<Topic> topicList;
	
	
	
	public Group(String title, String cover) {
		super();
		this.title = title;
		this.cover = cover;
		this.topicList = new ArrayList<Topic>();
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
