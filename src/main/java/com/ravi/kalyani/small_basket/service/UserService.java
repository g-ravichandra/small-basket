package com.ravi.kalyani.small_basket.service;

import com.ravi.kalyani.small_basket.entities.User;
import com.ravi.kalyani.small_basket.exception.ResourceNotFoundException;
import com.ravi.kalyani.small_basket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: "+ id));
    }

    public User updateUser(Long id, User user){
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: "+ id));
        existingUser.setName(user.getName());
        existingUser.setAdmin(user.getAdmin());
        existingUser.setEmail(user.getEmail());
        existingUser.setAge(user.getAge());
        existingUser.setPassword(user.getPassword());
        existingUser.setCart(user.getCart());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: "+ id));

    }
}
