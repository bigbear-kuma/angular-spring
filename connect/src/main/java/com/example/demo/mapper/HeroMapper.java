package com.example.demo.mapper;

import java.util.List;
//import com.example.demo.entity.Hero;
import com.example.demo.entity.Hero;   
import org.apache.ibatis.annotations.Mapper;



@Mapper  // もしくは @MapperScan を使う
public interface HeroMapper {
  List<Hero> findAll();
}
