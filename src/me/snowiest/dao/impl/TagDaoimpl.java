package me.snowiest.dao.impl;

import me.snowiest.dao.TagDao;
import me.snowiest.dao.base.BaseDao;
import me.snowiest.entity.Tag;

import java.util.List;

public class TagDaoimpl extends BaseDao<Tag> implements TagDao {
    @Override
    public List<Tag> getTagsByPictureId(Integer pictureId) throws Exception {
        return queryList(
                "select * from t_tag where tid = ?",
                Tag.class,
                pictureId
        );
    }
}
