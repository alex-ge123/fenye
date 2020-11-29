package com.alex.pagehelp.po;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * */
@Data

public class Student implements Serializable {
    private int id;
    private String name;
    private String sex;
    private int age;

}
