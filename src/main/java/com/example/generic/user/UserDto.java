package com.example.generic.user;

import com.example.generic.base.dto.BaseDto;
import lombok.Data;
import lombok.Value;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link User}
 */
@Data
@Accessors(chain = true)
public class UserDto extends BaseDto {
    String email;
}
