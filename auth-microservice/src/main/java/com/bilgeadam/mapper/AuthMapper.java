
package com.bilgeadam.mapper;


import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.repository.entity.Personal;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {

    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);

    Personal toPersonal(final RegisterRequestDto dto);


}
