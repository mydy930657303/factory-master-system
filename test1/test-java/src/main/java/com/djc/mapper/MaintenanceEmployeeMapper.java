package com.djc.mapper;

import com.djc.entity.MaintenanceEmployee;
import com.djc.entity.Vo.MaintenanceEmployeeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 维护安排与员工关系表
 * (MaintenanceEmployee)表数据库访问层
 *
 * @author djc
 * @since 2023-04-16 14:02:06
 */
public interface MaintenanceEmployeeMapper {

    List<MaintenanceEmployeeVo> queryMaintenanceEmployeeVo(Integer maintenanceArrangeId);
    /**
     * 通过ID查询单条数据
     *
     * @param maintenanceEmployeeId 主键
     * @return 实例对象
     */
    MaintenanceEmployee queryById(Integer maintenanceEmployeeId);

    /**
     * 查询指定行数据
     *
     * @param maintenanceEmployee 查询条件
     * @param pageable            分页对象
     * @return 对象列表
     */
    List<MaintenanceEmployee> queryAllByLimit(MaintenanceEmployee maintenanceEmployee, @Param("pageable") Pageable pageable);

    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    List<MaintenanceEmployee> queryAll(@Param("keyWord") String keyWord, @Param("page") int page, @Param("num") int num);

    /**
     * 统计总行数
     *
     * @param maintenanceEmployee 查询条件
     * @return 总行数
     */
    long count(MaintenanceEmployee maintenanceEmployee);

    /**
     * 新增数据
     *
     * @param maintenanceEmployee 实例对象
     * @return 影响行数
     */
    int insert(MaintenanceEmployee maintenanceEmployee);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MaintenanceEmployee> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MaintenanceEmployee> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MaintenanceEmployee> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MaintenanceEmployee> entities);

    /**
     * 修改数据
     *
     * @param maintenanceEmployee 实例对象
     * @return 影响行数
     */
    int update(MaintenanceEmployee maintenanceEmployee);

    /**
     * 通过主键删除数据
     *
     * @param maintenanceEmployeeId 主键
     * @return 影响行数
     */
    int deleteById(Integer maintenanceEmployeeId);

}

