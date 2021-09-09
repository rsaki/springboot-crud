package com.carpe.service;

import com.carpe.entity.EdocEntry;

import java.util.List;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
public interface EdocEntryService {
    //遍历出所有电子文档并指定下拉框查询
    List<EdocEntry> queryAllEntry();
    //增加电子文档
    int addEntry(EdocEntry edocEntry);
    //修改电子文档
    boolean updateEntry(EdocEntry edocEntry);
    //指定个查询电子文档
    EdocEntry queryByEntry(Integer id);
    //下拉框指定类型查询
    List<EdocEntry> queryByAllEntry(EdocEntry edocEntry);
    //删除文档信息
    int deleteEntry(EdocEntry edocEntry);
}
