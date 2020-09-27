package som.praveen.db;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class StoreDBClient {
	String host="http://localhost:8080/StoreDB/v1/storedb";
	public String getItem(String item) {
		MultivaluedMap<String, String> params = new MultivaluedMapImpl();
		params.add("item", item);
		WebResource resource = Client.create(new DefaultClientConfig()).resource(host).queryParams(params);
		System.out.println("URL = " + resource.getURI());
		Builder builder = resource.getRequestBuilder();
		String response = builder.get(String.class);
		System.out.println(" response = " + response);
		return response;
	}
}
