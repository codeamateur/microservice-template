package com.zjx.dev.template.auth.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto{

    private int id;

    private String avatar;

    private String username;

    private String password;

    private String name;

    private Timestamp birthday;

    private Integer sex;

    private String email;

    private String phone;

    private List<String> roles;

    private List<String> permissions;

}
