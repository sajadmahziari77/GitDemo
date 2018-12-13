package com.example.sajjad.test1;

import android.graphics.drawable.Drawable;

public class post {
    private int id;
    private Drawable postImage;
    private String title;
    private String content;
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getPostImage() {
        return postImage;
    }

    public void setPostImage(Drawable postImage) {
        this.postImage = postImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
