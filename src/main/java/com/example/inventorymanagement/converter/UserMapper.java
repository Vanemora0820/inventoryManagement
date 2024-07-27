package com.example.inventorymanagement.converter;

import com.example.inventorymanagement.Dto.UserDto;
import com.example.inventorymanagement.entity.User;

public class UserMapper {


    public static UserDto userDto (User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        return userDto;
    }

    public static User user(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        return user;
    }
}
