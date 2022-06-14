/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.postSerrvice.micro.controller;

import com.postSerrvice.micro.entity.Post;
import com.postSerrvice.micro.repository.PostRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Copito
 */
@RestController
@RequestMapping("/api/post")
public class PostRestController {
    @Autowired
    PostRepository pr;
    
    @GetMapping()
    public List<Post> list() {
        return pr.findAll();
    }
    
    @GetMapping("/{id}")
    public Post get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Post input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Post input) {
        Post save = pr.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
