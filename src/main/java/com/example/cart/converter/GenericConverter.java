package com.example.cart.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenericConverter {
    private final ModelMapper modelMapper;

    public GenericConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public <E, D> List<D> convertToDtoList(List<E> entities, Class<D> dtoClass) {
        return entities.stream()
                .map(entity -> convertToDto(entity, dtoClass))
                .toList();
    }

    public <E, D> D convertToDto(E entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public <D, E> List<E> convertToEntityList(List<D> dtos, Class<E> entityClass) {
        return dtos.stream()
                .map(dto -> convertToEntity(dto, entityClass))
                .toList();
    }

    public <D, E> E convertToEntity(D dto, Class<E> entityClass) {
        return modelMapper.map(dto, entityClass);
    }
}