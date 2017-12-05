package com.wb.test.comment.service;

import com.wb.test.comment.Comment;

import java.util.List;

public interface CommentService {


    Comment save(Comment comment);

    List<Comment> listAll();

    Comment get(int id);
}
