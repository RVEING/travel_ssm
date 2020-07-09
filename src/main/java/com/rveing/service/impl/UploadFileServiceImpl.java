package com.rveing.service.impl;

import com.rveing.service.UploadFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Override
    public List<String> uploadFile(MultipartFile[] files) throws Exception{
        List<String> picPath = null;
        // 先判断文件files不为空
        if (files != null && files.length > 0) {
            picPath = new ArrayList<String>();
            for (MultipartFile file : files) { //循环遍历，取出单个文件，下面的操作和单个文件就一样了
                if (!file.isEmpty()) {//这个判断必须加上
                    // 获得原始文件名
                    String originalFileName = file.getOriginalFilename();
                    //新文件名
                    String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
                    String save = "travel/"+newFileName;
                    picPath.add(save);
                    //获得物理路径webapp所在路径，即新文件将要保存的路径
                    String pathRoot = "E:/upload/temp/"+"travel/";
                    //新图片
                    File newFile = new File(pathRoot+newFileName);
                    //将内存的图片数据写入磁盘
                    file.transferTo(newFile);

                }
            }
        }
        return picPath;
    }
}
