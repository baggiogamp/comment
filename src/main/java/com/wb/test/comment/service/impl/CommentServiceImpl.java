package com.wb.test.comment.service.impl;

import com.wb.test.comment.Comment;
import com.wb.test.comment.dao.CommentDao;
import com.wb.test.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService{


    @Autowired
    private CommentDao commentDao;


    public Comment save(Comment comment){

        commentDao.insert(comment);
        System.out.println("=========================================");
        System.out.println(comment);
        return comment;

    }

    public List<Comment> listAll() {
        return commentDao.listAll();
    }

    public Comment get(int id){
        return commentDao.get(id);
    }
}
