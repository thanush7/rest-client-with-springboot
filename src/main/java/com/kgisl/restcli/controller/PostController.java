package com.kgisl.restcli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.restcli.entity.Post;
import com.kgisl.restcli.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
    
    @Autowired
    private PostService postservice;

    // public PostController(PostService postservice){
    //     this.postservice=postservice;
    // }

    @GetMapping("/")
    public List<Post> getAllPost(){
        return postservice.getAllPosts();
    }
     
    @PostMapping("/")
    public Post createPost(@RequestBody Post post) {
        return postservice.createPost(post);
    }

    @PutMapping("/{id}")
    public Post updatePerson(@PathVariable int id, @RequestBody Post post) {
        return postservice.updatePerson(id, post);
    }


    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id) {
        postservice.deletePost(id);
    }

    
   
}
