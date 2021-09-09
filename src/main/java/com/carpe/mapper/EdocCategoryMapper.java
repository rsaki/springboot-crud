package com.carpe.mapper;

import com.carpe.entity.EdocCategory;

import java.util.List;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
public interface EdocCategoryMapper {
    //查询所有分类
    List<EdocCategory> queryCategory();

}
