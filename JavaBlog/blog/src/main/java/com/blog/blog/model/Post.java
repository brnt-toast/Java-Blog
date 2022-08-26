/*
 * Simple model for a Post 
 * including: title of the post,  content of the post and the the author
 */

package com.blog.blog.model;

public class Post {
    private String title;
    private String content;
    private String author;
    public long id;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

}