package com.djc.service;

import com.djc.entity.InformationReceiver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 消息接收者(InformationReceiver)表服务接口
 *
 * @author djc
 * @since 2023-04-16 14:02:09
 */
public interface InformationReceiverService {

    /**
     * 通过ID查询单条数据
     *
     * @param receiverId 主键
     * @return 实例对象
     */
    InformationReceiver queryById(Integer receiverId);


    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    List<InformationReceiver> queryAll(String keyWord, int page, int num);

    /**
     * 新增数据
     *
     * @param informationReceiver 实例对象
     * @return 实例对象
     */
    InformationReceiver insert(InformationReceiver informationReceiver);

    /**
     * 修改数据
     *
     * @param informationReceiver 实例对象
     * @return 实例对象
     */
    InformationReceiver update(InformationReceiver informationReceiver);

    /**
     * 通过主键删除数据
     *
     * @param receiverId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer receiverId);

}
