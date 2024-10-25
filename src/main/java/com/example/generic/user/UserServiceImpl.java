package com.example.generic.user;

import com.example.generic.base.services.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
        extends GenericServiceImpl<Long, UserDto, User, UserRepository, UserMapper>
        implements UserService {

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
