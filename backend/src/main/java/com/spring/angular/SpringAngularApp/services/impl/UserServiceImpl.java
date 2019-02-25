package com.spring.angular.SpringAngularApp.services.impl;

import com.spring.angular.SpringAngularApp.dao.UserRepository;
import com.spring.angular.SpringAngularApp.entity.User;
import com.spring.angular.SpringAngularApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id = " + id));
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }
}