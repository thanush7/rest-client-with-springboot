package com.kgisl.restcli.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import com.kgisl.restcli.entity.Post;


@Service
public class PostService {

    private final RestClient restclient;

    public PostService() {
        this.restclient = RestClient.create();
    }

    @SuppressWarnings("unchecked")
    public List<Post> getAllPosts() {
        return restclient.get()
                .uri("http://localhost:9090/person")
                .retrieve()
                .body(List.class);
    }

    public Post createPost(Post post) {
        return restclient.post()
                .uri("http://localhost:9090/person")
                .body(post)
                .retrieve()
                .body(Post.class);
    }

    public void deletePost(int id) {
        restclient.delete()
                .uri("http://localhost:9090/person/{id}", id)
                .retrieve()
                .toBodilessEntity();  // No response body
    }

   private final RestTemplate restTemplate = new RestTemplate();

    public Post updatePerson(int id, Post person) {
        var requestEntity = new HttpEntity<Post>(person);
        String url="http://localhost:9090/person/"+id;

        ResponseEntity<Post> responseEntity;
        responseEntity = restTemplate.exchange(
                url,
                HttpMethod.PUT, 
                requestEntity,
                Post.class
        );

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody(); // Updated person object
        } else {
            return null; // Handle NOT_FOUND or other status
        }
    }

}
