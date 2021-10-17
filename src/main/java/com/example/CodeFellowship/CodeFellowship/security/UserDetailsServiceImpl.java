package com.example.CodeFellowship.CodeFellowship.security;

import com.example.CodeFellowship.CodeFellowship.models.ApplicationUser;
import com.example.CodeFellowship.CodeFellowship.repos.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        ApplicationUser applicationUser =
                applicationUserRepository.findByUsername(username);


        if (applicationUser == null) {
            throw new UsernameNotFoundException(username + " does not exist");
        }
        return applicationUser;
    }
}