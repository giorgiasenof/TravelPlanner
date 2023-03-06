package com.example.travelplanner.converter;


import java.util.List;

public interface Converter<Entity,DTO> {

        public Entity toEntity(DTO dto);

        public DTO toDTO(Entity entity);

        public List<DTO> toDTOList(Iterable<Entity> entityList);

        public List<Entity> toEntityList(Iterable<DTO> dtoList);

}
