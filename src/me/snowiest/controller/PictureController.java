package me.snowiest.controller;

import me.snowiest.entity.Picture;
import me.snowiest.service.PictureService;
import me.snowiest.service.impl.PictureServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/picture")
public class PictureController extends HttpServlet {
    private PictureService ps = new PictureServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pid = req.getParameter("pid");
        Picture picture;
        try {
            picture = ps.getPictureById(Integer.parseInt(pid));
            picture.setName(getServletContext().getRealPath("picture" + File.separator + picture.getName()));
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("无法找到对应资源");
            return;
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(picture.getName()));
        BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());

        String filename = req.getParameter("filename");
        if (filename != null && !filename.equals("")) {
            //弹出下载窗口
            resp.setHeader("Content-Disposition", "SillyBrowser;filename=" + filename);
            resp.setContentType("mimeType = " + getServletContext().getMimeType(picture.getName()));
        }
        int len;
        byte[] buffer = new byte[4096];
        while ((len = bis.read(buffer)) != -1)
            bos.write(buffer, 0, len);
        bis.close();
        bos.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //todo 文件上传
        System.out.println(req.getParameterNames());
    }
}
