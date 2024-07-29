package com.example.inventorymanagement.service;

import com.example.inventorymanagement.Dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDtO);
}
