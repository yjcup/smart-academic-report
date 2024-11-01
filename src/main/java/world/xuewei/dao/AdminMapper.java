package world.xuewei.dao;

import org.apache.ibatis.annotations.Mapper;
import world.xuewei.entity.Admin;

import java.util.List;

/**
 * (Admin)表数据库访问层
 *
 * <p>
 * ==========================================================================
 
 */
@Mapper
public interface AdminMapper {

    /**
     * 添加Admin
     */
    int insert(Admin admin);

    /**
     * 删除Admin
     */
    int deleteById(Integer id);

    /**
     * 查询单条数据
     */
    Admin getByNo(String no);

    /**
     * 查询单条数据
     */
    Admin getById(Integer id);

    /**
     * 查询全部数据
     * 分页使用MyBatis的插件实现
     */
    List<Admin> listAdmins();

    /**
     * 实体作为筛选条件查询数据
     */
    List<Admin> listAdmins(Admin admin);

    /**
     * 实体作为筛选条件获取结果数量
     */
    int countAdmins(Admin admin);

    /**
     * 修改Admin, 根据 admin 的主键修改数据
     */
    int update(Admin admin);

}