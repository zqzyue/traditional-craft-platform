package com.craft.mapper;

import com.craft.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PostMapper {
    @Select("SELECT id, title, cover_img coverImg, author_id authorId, create_time createTime " +
            "FROM post ORDER BY create_time DESC")
    List<Post> listAll();
    @Insert("INSERT INTO post(title, cover_img, author_id) VALUES(#{title}, #{coverImg}, #{authorId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Post post);
}
