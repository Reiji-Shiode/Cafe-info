package com.example.cafeinformation;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CafeMapper {

    @Select("SELECT * FROM cafes")
    List<Cafe> findAll();

    @Select("SELECT * FROM cafes WHERE place LIKE CONCAT(#{prefix}, '%')")
    List<Cafe> findByPlaceEqualsWith(String place);
}
