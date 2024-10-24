package com.example.generic.user;

import com.example.generic.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class User extends BaseEntity {
    private String email;
    private String password;
}
