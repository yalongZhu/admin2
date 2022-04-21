package com.atguigu.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Administrator
 * @title: User
 * @projectName admin
 * @description: TODO
 * @date 2022-04-19-15:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userName;
    private String password;
}
