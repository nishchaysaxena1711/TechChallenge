package com.TechChallengeJava.Nishchay.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.TechChallengeJava.Nishchay.Bean.ParentBeans;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

public class OAuth {

	public ParentBeans sign(String myUrl) {
		
		OAuthConsumer consumer = new DefaultOAuthConsumer("productnishchay-152926", "opembGNL9a5miPcL");
		URL url=null;
		try {
			url = new URL(myUrl);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		HttpURLConnection requestCon=null;
		try {
			requestCon = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		requestCon.setRequestProperty("Accept", "application/json");
		try {
			consumer.sign(requestCon);
			requestCon.connect();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(requestCon.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str="";
		String l = "";
		try {
			while((str=br.readLine())!=null) {
				System.out.println(str);
				l= l+str;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new MapJson().mapJson(l);
	}
}
