package com.carpe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EdocEntry {

    private Integer id;
    private Integer categoryId;
    private String title;
    private String summary;
    private String uploadUser;
    private Date createDate;
}
