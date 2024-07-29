package com.example.inventorymanagement.service.implementation;

import com.example.inventorymanagement.Dto.UserDto;
import com.example.inventorymanagement.converter.UserMapper;
import com.example.inventorymanagement.entity.User;
import com.example.inventorymanagement.repository.UserRepository;
import com.example.inventorymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::userDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.user(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.userDto(savedUser);
    }
}
