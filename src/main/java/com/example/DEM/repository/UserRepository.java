package com.example.DEM.repository;

import com.example.DEM.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
  UserEntity findByUsername(String username);
}
