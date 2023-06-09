package com.djc.mapper;

import com.djc.entity.Employee;
import com.djc.entity.Vo.QueryEmployeeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 员工表(Employee)表数据库访问层
 *
 * @author djc
 * @since 2023-04-15 15:54:57
 */
public interface EmployeeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param employeeId 主键
     * @return 实例对象
     */
    QueryEmployeeVo queryById(Integer employeeId);

    /**
     * 查询指定行数据
     *
     * @param employee 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<QueryEmployeeVo> queryAllByLimit(@Param("employee") Employee employee, @Param("pageable") Pageable pageable);

    /**
     * 模糊查询
     * @param employee
     * @param pageable
     * @return
     */
    List<QueryEmployeeVo> queryAllByLike(@Param("employee") Employee employee, @Param("pageable") Pageable pageable);

    /**
     * 通过主键查询单条数据
     *
     * @param keyWord 关键字
     * @param page    页码
     * @param num     每页数量
     * @return 多条数据
     */
    List<Employee> queryAll(@Param("keyWord") String keyWord, @Param("page") int page, @Param("num") int num);

    /**
     * 统计总行数
     *
     * @param employee 查询条件
     * @return 总行数
     */
    long count(Employee employee);

    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 影响行数
     */
    int insert(Employee employee);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employee> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Employee> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employee> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Employee> entities);

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 影响行数
     */
    int update(Employee employee);

    /**
     * 通过主键删除数据
     *
     * @param employeeId 主键
     * @return 影响行数
     */
    int deleteById(Integer employeeId);

    List<String> selectPoints(String role);

    List<String> selectMenus(String role);

    List<QueryEmployeeVo> queryByTeam(@Param("teamId") Integer id, @Param("page") int page,@Param("num") Integer num);

    Employee queryPassword(@Param("employeeId") Integer employeeId);

    Integer queryByLikeCount(@Param("employee") Employee employee);

    List<Employee> queryByRole(String role);
}

