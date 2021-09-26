package me.snowiest.dao.impl;

import me.snowiest.dao.PictureDao;
import me.snowiest.dao.base.BaseDao;
import me.snowiest.entity.Picture;

public class PictureDaoImpl extends BaseDao<Picture> implements PictureDao {
    @Override
    public Picture getPictureById(Integer pid) throws Exception {
        return queryOne(
                "select * from t_picture where pid = ?",
                Picture.class,
                pid
        );
    }

    @Override
    public int addPicture(Picture picture) throws Exception {
        return update(
                "insert into t_picture values(null,?,?,?)",
                picture.getName(),
                picture.getPath(),
                picture.getDescription()
        );
    }
}
