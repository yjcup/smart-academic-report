package world.xuewei.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import world.xuewei.dto.ResponseResult;
import world.xuewei.entity.Teacher;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * 教师控制器
 *
 * <p>
 * ==========================================================================
 
 */
@RestController
@Slf4j
public class TeacherController extends BaseController {

    /**
     * 查询所有教师
     */
    @GetMapping("/allTeachers")
    public String listAll(Integer page, Integer rows, String searchField, String searchString) {
        return JSONObject.toJSONString(teacherService.pageAllTeachers(page, rows, searchField, searchString));
    }

    /**
     * 编辑、删除教师
     */
    @PostMapping("/editTeacher")
    public void editTeacher(Teacher teacher, String action) {
        teacherService.editTeacher(teacher, action);
    }

    /**
     * 导出Excel
     */
    @GetMapping("/exportTeachers")
    public void exportTeachers(HttpServletResponse response) throws IOException {
        teacherService.exportTeachers(response);
    }

    /**
     * 批量导入教师
     */
    @PostMapping("/importTeachers")
    @Transactional
    public ResponseResult importTeachers(MultipartFile file) {
        log.info("接收到文件：{}", file.getOriginalFilename());
        if (!Objects.requireNonNull(file.getOriginalFilename()).endsWith(".xls")) {
            result.setCode(301);
            result.setMessage("请上传【.xls】文件");
            return result;
        }
        return teacherService.importTeachers(file);
    }
}
