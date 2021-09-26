package me.snowiest.dao;

import me.snowiest.entity.Tag;

import java.util.List;

public interface TagDao {
    List<Tag> getTagsByPictureId(Integer pictureId) throws Exception;
}
