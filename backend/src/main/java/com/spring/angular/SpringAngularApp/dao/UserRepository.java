package com.spring.angular.SpringAngularApp.dao;

import com.spring.angular.SpringAngularApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
}
