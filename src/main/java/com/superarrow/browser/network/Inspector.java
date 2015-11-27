package com.superarrow.browser.network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Inspector {
	public static final long low_threshold = 100000;
	public static class TypeSize {
		public String type;
		public long size;
		
		public String url;
	}
	
	public static TypeSize checkTypeSize(String url) {
		TypeSize result = new TypeSize();
		
		HttpURLConnection connection;
		try {
		    connection = (HttpURLConnection) ( new URL(url)).openConnection();
		    connection.setRequestMethod("HEAD");
		    connection.connect();
		    String size = connection.getHeaderField("Content-Length");
		    String type = connection.getHeaderField("Content-Type");
		    
		    //System.out.println(size + " " + type);
		    result.size = Long.parseLong(size);
		    result.type = type;
		    result.url = url;

		} catch (ProtocolException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		return result;
	}
	
	public static Set<TypeSize> filterURL(Set<String> urls) {
		Set<TypeSize> metaSet = new HashSet<TypeSize>();
		
		for(String url : urls) {
			TypeSize meta = checkTypeSize(url);
			if(meta.size > low_threshold)
				metaSet.add(meta);
		}
		
		
		return metaSet;
	}
	
	
	
	public static void main(String[] args) {
		checkTypeSize("http://channelz2.cachehn34.vcdn.vn/zv/6440a40125b34f757df00e1345c2ee58/5657ab10/2015/11/04/c/1/c1f4116eaf356b16738651e25e2792f9.mp4");
	}

}
