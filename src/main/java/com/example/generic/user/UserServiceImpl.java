package com.example.generic.user;

import com.example.generic.base.services.GenericServiceImpl;

public class UserServiceImpl
        extends GenericServiceImpl<Long, UserDto, User, UserRepository, UserMapper>
        implements UserService {
}
