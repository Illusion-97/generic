package com.example.generic.user;

import com.example.generic.base.controller.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends GenericController<Long, UserDto, UserService> {

    protected UserController(UserService service) {
        super(service);
    }
}
