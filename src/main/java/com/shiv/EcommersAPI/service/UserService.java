package com.shiv.EcommersAPI.service;

import com.shiv.EcommersAPI.model.User;
import com.shiv.EcommersAPI.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;



    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }
}
