package com.sk.web.utils;

import net.coobird.thumbnailator.Thumbnails;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author jinshi
 * @Date 2021/2/18 17:13
 * @Version 1.0
 */
public class FileUtil {
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }


    /**
     * compressImage
     *
     * @param path
     * @param
     * @return
     */
    public static byte[] compressImage(String path, int width,int height) {
        byte[] smallImage = null;

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            Thumbnails.of(path).size(width, height).outputQuality(0.8).outputFormat("jpg").toOutputStream(out);
            smallImage = out.toByteArray();
            return smallImage;
        } catch (IOException e) {
            //log.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
