package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.blog.model.User;
import com.blog.blog.model.Post;

@Controller
public class PostController{

    @RequestMapping(value = "/newPost", method = RequestMethod.GET)
    public String newPost(){
        return "Hello";
    }

}