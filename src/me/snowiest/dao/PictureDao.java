package me.snowiest.dao;

import me.snowiest.entity.Picture;

public interface PictureDao {
    Picture getPictureById(Integer pid) throws Exception;

    int addPicture(Picture picture) throws Exception;
}
