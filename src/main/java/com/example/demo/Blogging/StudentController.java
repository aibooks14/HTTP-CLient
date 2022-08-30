package com.example.demo.Blogging;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentController {

	public static void main(String[] args) throws RestClientException, IOException, InterruptedException, URISyntaxException {
		RestTemplate restTemplate = new RestTemplate() ;
		Student student = new Student("sagar", "Programmer", 98121, "Delhi");
		
		URI url = null ;

			url = new URI("https://reqres.in/api/users") ;
		
		 
		
//		RequestEntity<Student> request = RequestEntity.post(url).accept(MediaType.APPLICATION_JSON).body(student);
//		ResponseEntity<Student> response = new  RestTemplate().exchange(request, Student.class);
//		System.out.println(response);
		
		RequestEntity<Student> request = RequestEntity.post(url)
		                                             .contentType(MediaType.APPLICATION_JSON)
		                                             .body(student);
////
////		//リクエストの送信
		RestTemplate restTemplate1 = new RestTemplate();
		ResponseEntity<String> response = restTemplate1.exchange(request, String.class);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCodeValue());
		System.out.println("-------------------------------");
		
		String url1=  "https://reqres.in/api/users" ;
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(student) ;
		System.out.println(json);

		var request1 = HttpRequest.newBuilder().uri(URI.create(url1)).POST(HttpRequest.BodyPublishers.ofString(json)).build() ;
		var client = HttpClient.newBuilder().build() ;
		

		 HttpResponse<String>	response1 = client.send(request1, HttpResponse.BodyHandlers.ofString()) ;
	
		System.out.println(response1.body());
		System.out.println(response1.statusCode());
		
		//https://qiita.com/suema0331/items/93a8e1c5bda955d3ef6b
		
	    //nameキーを受け取ってString生成
//	    var req = HttpRequest.newBuilder()
//	      .uri(URI.create("https://www.sample/post.php")) //"こんにちは、さん！"
//	      .header("Content-Type","application/json")
//	      .POST(HttpRequest.BodyPublishers.ofString(
//	         "{ \"name\" : \"Qiita Neko\" }")) 
//	      .build();
//	    var res = client.send(req, HttpResponse.BodyHandlers.ofString());
//		


	}

}
//https://b1san-blog.com/post/spring/spring-rest-template/
