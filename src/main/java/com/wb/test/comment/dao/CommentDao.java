package com.wb.test.comment.dao;

import com.wb.test.comment.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface CommentDao {


    final String INSERT = "insert into comment(id, title, content) values (null, #{title}, #{content})";

    @Insert(INSERT)
    @Options(useGeneratedKeys = true)
    void insert(Comment comment);


    @Select("select * from comment")
    List<Comment> listAll();

    @Select("select * from comment where id = #{id}")
    Comment get(int id);

}
