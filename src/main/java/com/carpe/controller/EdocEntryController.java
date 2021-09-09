package com.carpe.controller;

import com.carpe.entity.EdocEntry;
import com.carpe.service.EdocCategoryService;
import com.carpe.service.EdocEntryService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Carpe
 * @data 2021/9/8
 * @apiNote
 */
@MapperScan("com.carpe.mapper")
@Controller
public class EdocEntryController {
    @Autowired
    private EdocEntryService edocEntryService;

    @Autowired
    private EdocCategoryService edocCategoryService;
    //跳转增加页面
    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        //下拉框信息
        model.addAttribute("categoryList", edocCategoryService.queryCategory());
        return "add";
    }

    //增加文档信息方法
    @RequestMapping("/addInfo")
    public String addInfo(EdocEntry edocEntry) {
        edocEntryService.addEntry(edocEntry);
        return "redirect:/showInfo";
    }

    //跳转到修改页面并遍历出来
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        //下拉框信息
        model.addAttribute("categoryList", edocCategoryService.queryCategory());
        model.addAttribute("entryList", edocEntryService.queryByEntry(id));
        return "update";
    }

    //修改文档信息方法
    @RequestMapping("/updateInfo")
    public String updateInfo(EdocEntry edocEntry) {
        if (edocEntryService.updateEntry(edocEntry)) {
            return "redirect:/showInfo";
        }
        return "update";
    }

    //删除文档信息
    @RequestMapping(value = "/deleteEntry/{id}")
    public String deleteEntry(@PathVariable("id") Integer id, EdocEntry edocEntry) {
        edocEntry.setId(id);
        edocEntryService.deleteEntry(edocEntry);
        return "redirect:/showInfo";
    }
}
