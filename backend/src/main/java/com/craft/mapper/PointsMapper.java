package com.craft.mapper;

import com.craft.entity.Points;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointsMapper {
    @Insert("INSERT INTO points(user_id, points, reason) VALUES(#{userId}, #{points}, #{reason})")
    void insert(@Param("userId") Long userId, @Param("points") Integer points, @Param("reason") String reason);
}