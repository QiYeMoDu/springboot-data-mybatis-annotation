package com.qiyemodu.springbootdatamybatisannotation.mapper;

import com.qiyemodu.springbootdatamybatisannotation.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = '1'")
    public Department getDepartment();

}
