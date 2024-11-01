package world.xuewei.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import world.xuewei.dto.ResponseResult;
import world.xuewei.entity.Student;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 学生控制器
 *
 * <p>
 * ==========================================================================
 
 */
@RestController
@Slf4j
public class StudentController extends BaseController {

    /**
     * 修改邮箱
     */
    @PostMapping("/updateEmail")
    public ResponseResult updateEmail(@RequestParam("email") String email) {
        return studentService.updateEmail(email, loginUser, loginStudent);
    }

    /**
     * 修改手机号
     */
    @PostMapping("/updatePhone")
    public ResponseResult updatePhone(@RequestParam("phone") String phone) {
        return studentService.updatePhone(phone, loginUser, loginStudent, loginTeacher);
    }

    /**
     * 查询所有学生
     */
    @GetMapping("/allStudents")
    public String listAll(Integer page, Integer rows, String searchField, String searchString) {
        return JSONObject.toJSONString(studentService.pageAllStudents(page, rows, searchField, searchString));
    }

    /**
     * 编辑、删除学生
     */
    @PostMapping("/editStudent")
    public void editStudent(Student student, String action) {
        studentService.editStudent(student, action);
    }

    /**
     * 导出Excel
     */
    @GetMapping("/exportStudents")
    public void exportStudents(HttpServletResponse response) throws IOException {
        studentService.exportStudents(response);
    }

    /**
     * 批量导入学生
     */
    @PostMapping("/importStudents")
    @Transactional
    public ResponseResult importStudents(MultipartFile file) {
        log.info("接收到文件：{}", file.getOriginalFilename());
        if (!file.getOriginalFilename().endsWith(".xls")) {
            result.setCode(301);
            result.setMessage("请上传【.xls】文件");
            return result;
        }
        return studentService.importStudents(file);
    }
}
