package world.xuewei.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import world.xuewei.entity.Report;

import java.util.List;

/**
 * (Report)表数据库访问层
 *
 * <p>
 * ==========================================================================
 
 */
@Mapper
public interface ReportMapper {

    /**
     * 添加Report
     */
    int insert(Report report);

    /**
     * 删除Report
     */
    int deleteById(Integer id);

    /**
     * 查询单条数据
     */
    Report getById(Integer id);

    /**
     * 查询全部数据
     * 分页使用MyBatis的插件实现
     */
    List<Report> listReports();

    /**
     * 实体作为筛选条件查询数据
     */
    List<Report> listReports(Report report);

    /**
     * 根据学院ID获取报告
     */
    List<Report> listReportsByCollegeId(@Param("id") Integer id, @Param("status") Integer status);

    /**
     * 实体作为筛选条件获取结果数量
     */
    int countReports(Report report);

    /**
     * 修改Report, 根据 report 的主键修改数据
     */
    int update(Report report);

}