package com.example.demo.mapper;

import java.util.List;
//import com.example.demo.entity.Hero;
import com.example.demo.entity.Hero;   
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper  // もしくは @MapperScan を使う
public interface HeroMapper {
  @Select("SELECT id, name FROM heroes")
  List<Hero> findAll();
}
