package com.endtoend.demo.mappers;

public interface BaseMapper<E, D> {
    D toDTO(E entity);
    E toEntity(D dto);
}
