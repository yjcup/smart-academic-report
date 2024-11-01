package world.xuewei.service;

import org.springframework.stereotype.Service;
import world.xuewei.dao.AdminMapper;
import world.xuewei.entity.Admin;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Admin)表业务接口实现类
 *
 * <p>
 * ==========================================================================
 
 */
@Service
public class AdminService {

    @Resource
    private AdminMapper adminMapper;

    public boolean insert(Admin admin) {
        return adminMapper.insert(admin) == 1;
    }

    public boolean deleteById(Integer id) {
        return adminMapper.deleteById(id) == 1;
    }

    public Admin getById(Integer id) {
        return adminMapper.getById(id);
    }

    public Admin getByNo(String no) {
        return adminMapper.getByNo(no);
    }

    public List<Admin> listAdmins() {
        return adminMapper.listAdmins();
    }

    public List<Admin> listAdmins(Admin admin) {
        return adminMapper.listAdmins(admin);
    }

    public int countAdmins(Admin admin) {
        return adminMapper.countAdmins(admin);
    }

    public boolean update(Admin admin) {
        return adminMapper.update(admin) == 1;
    }

}