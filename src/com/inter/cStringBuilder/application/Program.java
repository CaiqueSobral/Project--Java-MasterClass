package com.inter.cStringBuilder.application;

import com.inter.cStringBuilder.entities.Comment;
import com.inter.cStringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!!");
        Comment c2 = new Comment("Wow that's awesome!!");

        Post p1 = new Post(sdf.parse("21/06/2022 13:05:44"), "Travelling to New Zeland", "I'm going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1.toString());
    }
}
