package com.zjx.dev.template.account.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("用户信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends AccountDto{

    @ApiModelProperty("密码")
    private String password;
}
