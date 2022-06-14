/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.postSerrvice.micro.repository;

import com.postSerrvice.micro.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Copito
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
    
}
