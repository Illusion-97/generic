package com.example.generic.base.dto;

import com.example.generic.base.GenericId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseDto implements GenericId<Long> {
    private Long id;
    private int version;
}
