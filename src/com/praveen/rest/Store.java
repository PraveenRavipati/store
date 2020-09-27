package com.praveen.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import som.praveen.db.StoreDBClient;

@Path("/store")
public class Store {
	@GET
	@Path("/healthCheck")
	public String getMsg() {
		return "store is up and running.....";
	}
	
	@GET
	public String getItem(@QueryParam("item") String item) {
		String s = new StoreDBClient().getItem(item);
		return s;
	}
}
