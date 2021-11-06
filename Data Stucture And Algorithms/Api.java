package com.api;
import java.io.IOException;


public class Api{
	
	public static void main(String args[])
	{
		var url=" http://api.weatherapi.com/v1/current.json?key=5c2cced143574b9298b51840212904&q=mumbai";
		
		HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		
		var Client=HttpClient.newBuilder().build();
		
		var response=Client.send(request,HttpResponse.BodyHandler.ofString());
		System.out.println(response.body);
	}
	
}