package com.djc.service.impl;

import com.djc.entity.File;
import com.djc.mapper.FileMapper;
import com.djc.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件表(File)表服务实现类
 *
 * @author djc
 * @since 2023-04-20 11:10:08
 */
@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileMapper fileMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    @Override
    public File queryById(Integer fileId) {
        return this.fileMapper.queryById(fileId);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    @Override
    public List<File> queryAll(String keyWord, int page, int num) {
        return this.fileMapper.queryAll(keyWord, (page - 1) * num, num);
    }

    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    @Override
    public File insert(File file) {
        this.fileMapper.insert(file);
        return file;
    }

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    @Override
    public File update(File file) {
        this.fileMapper.update(file);
        return this.queryById(file.getFileId());
    }

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer fileId) {
        return this.fileMapper.deleteById(fileId) > 0;
    }

    @Override
    public List<File> queryByLimit(File file, int i, Integer num) {
        return fileMapper.queryAllByLimit(file, PageRequest.of(i,num));
    }

    @Override
    public Integer queryCount(File file) {
        return (int) fileMapper.count(file);
    }
}
