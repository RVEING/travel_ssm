package com.rveing.service;


import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadFileService {
    //返回上传的游记图片要保存进数据库的路径
    public List<String> uploadFile(MultipartFile[] files)throws Exception;

}
