package com.shiv.EcommersAPI.repo;

import com.shiv.EcommersAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
