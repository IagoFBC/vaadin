package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CompanyService {

    @Select("SELECT * FROM company ORDER BY id")
    List<Company> findAll();

    @Update("UPDATE company SET name = #{name}, website = #{website} WHERE id = #{id}")
    void update(Company company);

}
