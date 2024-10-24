package com.example.generic.base.entity;

import com.example.generic.base.GenericId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@MappedSuperclass
public abstract class BaseEntity implements GenericId<Long> {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;
    @Version // géré par JPA
    private int version;

}
