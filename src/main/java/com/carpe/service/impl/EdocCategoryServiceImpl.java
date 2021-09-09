package com.carpe.service.impl;

import com.carpe.entity.EdocCategory;
import com.carpe.entity.EdocEntry;
import com.carpe.mapper.EdocCategoryMapper;
import com.carpe.service.EdocCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
@Service
public class EdocCategoryServiceImpl implements EdocCategoryService {
    @Autowired
    EdocCategoryMapper edocCategoryMapper;
    @Override
    public List<EdocCategory> queryCategory() {
        return edocCategoryMapper.queryCategory();
    }



}
