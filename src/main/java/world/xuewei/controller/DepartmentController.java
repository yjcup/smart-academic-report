package world.xuewei.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.entity.Department;

/**
 * 部门控制器
 *
 * <p>
 * ==========================================================================
 
 */
@Slf4j
@RestController
public class DepartmentController extends BaseController {

    /**
     * 查询所有部门
     */
    @GetMapping("/allDepartments")
    public String listAll(Integer page, Integer rows, String searchField, String searchString) {
        return JSONObject.toJSONString(departmentService.pageAllDepartments(page, rows, searchField, searchString));
    }

    /**
     * 编辑、删除部门
     */
    @PostMapping("/editDepartment")
    public void editDepartment(Department department, String action) {
        departmentService.editDepartment(department, action);
    }
}
