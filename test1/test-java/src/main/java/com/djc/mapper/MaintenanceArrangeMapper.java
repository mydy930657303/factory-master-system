package com.djc.mapper;

import com.djc.entity.MaintenanceArrange;
import com.djc.entity.Vo.MaintenanceArrangeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 维护（保养）安排表(MaintenanceArrange)表数据库访问层
 *
 * @author djc
 * @since 2023-04-16 14:02:12
 */
public interface MaintenanceArrangeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param maintenanceArrangeId 主键
     * @return 实例对象
     */
    MaintenanceArrange queryById(Integer maintenanceArrangeId);

    /**
     * 查询指定行数据
     *
     * @param maintenanceArrange 查询条件
     * @param pageable           分页对象
     * @return 对象列表
     */
    List<MaintenanceArrange> queryAllByLimit(MaintenanceArrange maintenanceArrange, @Param("pageable") Pageable pageable);

    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    List<MaintenanceArrange> queryAll(@Param("keyWord") String keyWord, @Param("page") int page, @Param("num") int num);

    /**
     * 统计总行数
     *
     * @param maintenanceArrange 查询条件
     * @return 总行数
     */
    long count(MaintenanceArrange maintenanceArrange);

    /**
     * 新增数据
     *
     * @param maintenanceArrange 实例对象
     * @return 影响行数
     */
    int insert(MaintenanceArrange maintenanceArrange);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MaintenanceArrange> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MaintenanceArrange> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MaintenanceArrange> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MaintenanceArrange> entities);

    /**
     * 修改数据
     *
     * @param maintenanceArrange 实例对象
     * @return 影响行数
     */
    int update(MaintenanceArrange maintenanceArrange);

    /**
     * 通过主键删除数据
     *
     * @param maintenanceArrangeId 主键
     * @return 影响行数
     */
    int deleteById(Integer maintenanceArrangeId);

    List queryByLike(@Param("maintenanceArrange") MaintenanceArrange maintenanceArrange, @Param("pageable") PageRequest pageable);

    Integer likeNum(@Param("maintenanceArrange") MaintenanceArrange maintenanceArrange);

    MaintenanceArrangeVo queryVoById(Integer id);

}

