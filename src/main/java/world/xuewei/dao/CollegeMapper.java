package world.xuewei.dao;

import org.apache.ibatis.annotations.Mapper;
import world.xuewei.entity.College;

import java.util.List;

/**
 * (College)表数据库访问层
 *
 * <p>
 * ==========================================================================
 
 */
@Mapper
public interface CollegeMapper {

    /**
     * 添加College
     */
    int insert(College college);

    /**
     * 删除College
     */
    int deleteById(Integer id);

    /**
     * 查询单条数据
     */
    College getById(Integer id);

    /**
     * 查询全部数据
     * 分页使用MyBatis的插件实现
     */
    List<College> listColleges();

    /**
     * 实体作为筛选条件查询数据
     */
    List<College> listColleges(College college);

    /**
     * 实体作为筛选条件获取结果数量
     */
    int countColleges(College college);

    /**
     * 修改College, 根据 college 的主键修改数据
     */
    int update(College college);

}