package com.zjx.dev.template.account.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@ApiModel("账户信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    @ApiModelProperty("用户ID")
    private int id;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("登录名")
    private String username;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("生日")
    private Timestamp birthday;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("角色")
    private List<String> roles;

    @ApiModelProperty("权限")
    private List<String> permissions;

}
