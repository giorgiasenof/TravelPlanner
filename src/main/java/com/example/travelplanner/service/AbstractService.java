package com.example.travelplanner.service;


import com.example.travelplanner.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractService<Entity, DTO> implements ServiceDTO<DTO> {

    @Autowired
    protected CrudRepository<Entity, Long> crudRepository;

    @Autowired
    protected Converter<Entity, DTO> converter;

    public AbstractService() {
    }

    @Override
    public DTO insert(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }

    @Override
    public List<DTO> getAll() {
        return converter.toDTOList((crudRepository.findAll()));
    }

    @Override
    public DTO read(long id) {
        return converter.toDTO(crudRepository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(long id) {
        crudRepository.deleteById(id);
    }

}