package com.carpe.controller;

import com.carpe.entity.EdocCategory;
import com.carpe.entity.EdocEntry;
import com.carpe.service.EdocCategoryService;
import com.carpe.service.EdocEntryService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
@MapperScan("com.carpe.mapper")
@Controller
public class EdocCategoryController {
    @Autowired
    private EdocCategoryService edocCategoryService;
    @Autowired
    private EdocEntryService edocEntryService;

    @RequestMapping("/showInfo")
    public String showInfo(EdocEntry edocEntry, Model model) {
        //下拉框信息
        model.addAttribute("categoryList", edocCategoryService.queryCategory());
        //全部信息
        model.addAttribute("entryList",edocEntryService.queryAllEntry());
        //指定信息
        model.addAttribute("entryList",edocEntryService.queryByAllEntry(edocEntry));
        return "list";
    }


}
