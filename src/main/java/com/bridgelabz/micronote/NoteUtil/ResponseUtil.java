package com.bridgelabz.micronote.NoteUtil;

public class ResponseUtil {
	public static Response getResponse(int statusCode,String statusMessage) {
		Response response=new Response();
		response.setStatusCode(statusCode);
		response.setStatusMessage(statusMessage);
		return response;
	}
	public static Response getResponseNname(int statusCode,String statusMessage,String Name) {
		Response response=new Response();
		response.setStatusCode(statusCode);
		response.setStatusMessage(statusMessage);
		response.setName(Name);
		return response;
	}

}

