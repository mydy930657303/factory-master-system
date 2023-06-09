package com.djc.service;

import com.djc.entity.AccessoriesArrivalDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 到货详情(AccessoriesArrivalDetail)表服务接口
 *
 * @author djc
 * @since 2023-04-16 14:02:15
 */
public interface AccessoriesArrivalDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param arrivalDetailId 主键
     * @return 实例对象
     */
    AccessoriesArrivalDetail queryById(Integer arrivalDetailId);


    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    List<AccessoriesArrivalDetail> queryAll(String keyWord, int page, int num);

    /**
     * 新增数据
     *
     * @param accessoriesArrivalDetail 实例对象
     * @return 实例对象
     */
    AccessoriesArrivalDetail insert(AccessoriesArrivalDetail accessoriesArrivalDetail);

    /**
     * 修改数据
     *
     * @param accessoriesArrivalDetail 实例对象
     * @return 实例对象
     */
    AccessoriesArrivalDetail update(AccessoriesArrivalDetail accessoriesArrivalDetail);

    /**
     * 通过主键删除数据
     *
     * @param arrivalDetailId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer arrivalDetailId);

}
