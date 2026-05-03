package com.liyu.controller;

import com.liyu.pojo.Ms;
import com.liyu.pojo.Result;
import com.liyu.service.MsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms")
public class MsController {
    @Autowired
    private MsService msService;

    @RequestMapping
    public Result findAll() {
        System.out.println("查询所有员工信息");
        List<Ms> ms = msService.findAll();
        return Result.success(ms);
    }

    @PostMapping
    public Result addMs(@RequestBody Ms ms) {
        System.out.println("添加员工信息");
        msService.addMs(ms);
        return Result.success();
    }
}
