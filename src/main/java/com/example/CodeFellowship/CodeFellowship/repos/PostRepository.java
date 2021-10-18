package com.example.CodeFellowship.CodeFellowship.repos;

import com.example.CodeFellowship.CodeFellowship.models.ApplicationUser;
import com.example.CodeFellowship.CodeFellowship.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository <Post, Integer> {
    List<Post> findAllByUser (ApplicationUser applicationUser);
}
