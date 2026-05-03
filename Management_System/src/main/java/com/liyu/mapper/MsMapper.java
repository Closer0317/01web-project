package com.liyu.mapper;

import com.liyu.pojo.Ms;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MsMapper {

    @Select("select * from emp order by emp.create_time desc ")
    List<Ms> findAll();

    @Insert("insert into emp(emp_no,name,gender,dept,telephone,create_time) values(#{emp_no},#{name},#{gender},#{dept},#{telephone},#{created_time})")
    void add(Ms ms);
}
