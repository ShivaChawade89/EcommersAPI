package com.shiv.EcommersAPI.repo;

import com.shiv.EcommersAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
