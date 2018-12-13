package com.example.sajjad.test1;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class dataFakeGenerator {
    public List<post> getdata(Context context){

List<post> posts=new ArrayList<>();
    for (int i=0;i<=6;i++){
        post post=new post();
        post.setId(i);
        post.setTitle("لورم ایپسوم");
        post.setContent("لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.");
        post.setData("1 سااعت پیش");

        switch (i){
            case 1:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic1,false));
                break;
            case 2:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic2,false));
                break;
            case 3:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic3,false));
                break;
            case 4:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic4,false));
                break;
            case 5:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic5,false));
                break;
            case 6:
                post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic6,false));
                break;
        }
        posts.add(post);
    }
    return posts;
    }



}
