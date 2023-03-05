package com.example.travelplanner.mapper;

import com.example.travelplanner.dto.ManagerDTO;
import com.example.travelplanner.model.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagerMapper{

    ManagerMapper MINSTANCE = Mappers.getMapper(ManagerMapper.class);

    Manager toEntity(ManagerDTO manager);
    ManagerDTO toDto(Manager manager);
    List<Manager> toEntityList(Iterable<ManagerDTO>managerDTOS);
    List<ManagerDTO>toDtoList(Iterable<Manager>managers);
}
