package com.wb.test.comment.controller;

import com.wb.test.comment.Comment;
import com.wb.test.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {


    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public void create(@RequestBody Comment comment) {

        System.out.println(comment);
        commentService.save(comment);
    }

    @RequestMapping(value = "/comment/list", method = RequestMethod.GET)
    public List<Comment> list() {

        return commentService.listAll();
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public Comment get(@PathVariable int id) {
        return commentService.get(id);
    }
}

