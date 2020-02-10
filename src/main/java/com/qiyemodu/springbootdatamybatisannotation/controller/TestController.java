package com.qiyemodu.springbootdatamybatisannotation.controller;

import com.qiyemodu.springbootdatamybatisannotation.bean.Department;
import com.qiyemodu.springbootdatamybatisannotation.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@RestController
public class TestController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/getDepartment")
    @ResponseBody
    public Department getDepartment() {
        return departmentMapper.getDepartment();
    }
}
