package com.bigtrack.demo.mapper;

import com.bigtrack.demo.entity.SafetyCheck;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SafetyCheckMapper {
    @Select("SELECT temperature,insert_time FROM safety_long LIMIT 0,20")//取温度和对应的时间
    List<SafetyCheck> trackSafetySystemList();

    @Select("SELECT temperature FROM safety")
    String trackSafetySystem();
}
