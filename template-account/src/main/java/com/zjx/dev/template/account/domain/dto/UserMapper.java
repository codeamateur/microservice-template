package com.zjx.dev.template.account.domain.dto;

import com.zjx.dev.template.account.domain.entity.SysUserEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(target = "roles",source = "roles"),
            @Mapping(target = "permissions",source = "permissions")
    })
    AccountDto entityToAccountDto(SysUserEntity entity,List<String> roles,List<String> permissions);

    @Mapping(target = "permissions",source = "permissions")
    UserDto entityToUserDto(SysUserEntity entity,List<String> permissions);

    @InheritInverseConfiguration
    SysUserEntity fromDto(AccountDto dto);

    void updateCarFromDto(AccountDto dto, @MappingTarget SysUserEntity entity);


}
