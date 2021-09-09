package com.carpe.service.impl;

import com.carpe.entity.EdocEntry;
import com.carpe.mapper.EdocEntryMapper;
import com.carpe.service.EdocEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
@Service
public class EdocEntryMapperImpl implements EdocEntryService {
    @Autowired
    EdocEntryMapper edocEntryMapper;
    @Override
    public List<EdocEntry> queryAllEntry() {
        return edocEntryMapper.queryAllEntry();
    }

    @Override
    public int addEntry(EdocEntry edocEntry) {
        return edocEntryMapper.addEntry(edocEntry);
    }

    @Override
    public boolean updateEntry(EdocEntry edocEntry) {
        return edocEntryMapper.updateEntry(edocEntry);
    }

    @Override
    public EdocEntry queryByEntry(Integer id) {
        return edocEntryMapper.queryByEntry(id);
    }

    @Override
    public List<EdocEntry> queryByAllEntry(EdocEntry edocEntry) {
        return edocEntryMapper.queryByAllEntry(edocEntry);
    }

    @Override
    public int deleteEntry(EdocEntry edocEntry) {
        return edocEntryMapper.deleteEntry(edocEntry);
    }

}
