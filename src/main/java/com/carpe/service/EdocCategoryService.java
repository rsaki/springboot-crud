package com.carpe.service;

import com.carpe.entity.EdocCategory;
import com.carpe.entity.EdocEntry;

import java.util.List;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */

public interface EdocCategoryService {
    //查询所有分类
    List<EdocCategory> queryCategory();

}
