package me.snowiest.service;

import me.snowiest.entity.Picture;

public interface PictureService {
    public Picture getPictureById(Integer pid);

    public int addPicture(Picture picture);
}
