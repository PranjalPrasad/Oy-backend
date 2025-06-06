package com.oy.oy_jewels.service;


import com.oy.oy_jewels.entity.UserEntity;

import java.util.List;

public interface UserService {

    // Create new user
    UserEntity createUser(UserEntity user);

    // Get all users
    List<UserEntity> getAllUsers();

    // Get user by ID
    UserEntity getUserById(Long userId);

    // Update user
    UserEntity updateUser(Long userId, UserEntity user);

    // Delete user
    void deleteUser(Long userId);

    // Get users by status
    List<UserEntity> getUsersByStatus(String status);

    // Get user by email
    UserEntity getUserByEmail(String email);
}
