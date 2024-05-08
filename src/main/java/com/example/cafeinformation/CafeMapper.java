package com.example.cafeinformation;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CafeMapper {

    @Select("SELECT * FROM cafes")
    List<Cafe> findAll();
}
