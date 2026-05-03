package com.liyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ms {
    private Integer id;
    private String emp_no;
    private String name;
    private String dept;
    private char gender;
    private String telephone;
    private String created_time;
}
