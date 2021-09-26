package me.snowiest.service.impl;

import me.snowiest.dao.PictureDao;
import me.snowiest.dao.impl.PictureDaoImpl;
import me.snowiest.entity.Picture;
import me.snowiest.service.PictureService;

public class PictureServiceImpl implements PictureService {
    private PictureDao dao = new PictureDaoImpl();

    @Override
    public Picture getPictureById(Integer pid){
        try {
            return dao.getPictureById(pid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addPicture(Picture picture) {
        try {
            return dao.addPicture(picture);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
