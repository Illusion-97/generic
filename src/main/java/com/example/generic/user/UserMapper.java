package com.example.generic.user;

import com.example.generic.base.mapper.GenericMapper;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDto,User> {

}
