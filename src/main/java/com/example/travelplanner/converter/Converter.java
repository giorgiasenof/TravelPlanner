package com.example.travelplanner.converter;


import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface Converter<Entity,DTO> {

        public Entity toEntity(DTO dto);

        public DTO toDTO(Entity entity);

        public List<DTO> toDTOList(Iterable<Entity> entityList);

        public List<Entity> toEntityList(Iterable<DTO> dtoList);

}
