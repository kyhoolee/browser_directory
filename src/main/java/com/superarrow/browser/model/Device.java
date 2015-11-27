package com.superarrow.browser.model;

import com.superarrow.browser.util.Utils;

public class Device {
	
	public String deviceId;
	public String os;
	

	
	public String toString() {
		String result = "";
		try {
			result = Utils.toString(this);
		} catch (Exception e) {
			
		}
		return result;
	}
}
