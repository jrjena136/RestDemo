package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Path("demo")
public class RestfulApplicationPathAnnotationExample {
	@Path("hello")
	@GET
    @Produces(MediaType.TEXT_HTML)     
     public Response sayHello() {
          
        String str ="<H1>Hi!!! welcome to @ApplicationPath Annotation Example in Restful webservices  </H1> ";;
         
        return Response.status(200).entity(str).build();
 
    }
	
	@Path("json")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student getJSONResponse()
    {
        Student s = new Student();
        s.setAge(24);
        s.setName("Jyoti");
        s.setSubject("Java");
        s.setMobileNumber(1234567890);
        return s;
    }
	
	@Path("/customJson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomJsonResponse() {
		JsonObject parentJsonObj = new JsonObject();
		parentJsonObj.addProperty("name", "jyotiranjan");
		parentJsonObj.addProperty("age", "24");
		JsonObject addressObj = new JsonObject();
		JsonObject contactObj = new JsonObject();
		addressObj.addProperty("permanent", "Odisha");
		addressObj.addProperty("correspondence", "Pune");
		contactObj.addProperty("home", "1234567890");
		contactObj.addProperty("work", "0987654321");
		parentJsonObj.add("address", addressObj);
		parentJsonObj.add("contact", contactObj);
		return parentJsonObj.toString();
		
	}
}
