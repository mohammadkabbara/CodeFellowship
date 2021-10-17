package com.example.CodeFellowship.CodeFellowship.repos;

import com.example.CodeFellowship.CodeFellowship.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser,Integer> {
    public ApplicationUser findByUsername(String username);
}
