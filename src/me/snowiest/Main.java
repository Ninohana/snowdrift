package me.snowiest;

import me.snowiest.dao.impl.TagDaoimpl;
import me.snowiest.entity.Tag;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Tag> t = new TagDaoimpl().getTagsByPictureId(1);
            System.out.println(t);
            System.out.println("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
