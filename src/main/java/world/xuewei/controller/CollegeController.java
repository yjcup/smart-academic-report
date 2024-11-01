package world.xuewei.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.entity.College;

/**
 * 学院控制器
 *
 * <p>
 * ==========================================================================
 
 */
@RestController
@Slf4j
public class CollegeController extends BaseController {

    /**
     * 查询所有学院
     */
    @GetMapping("/allColleges")
    public String allColleges(Integer page, Integer rows) {
        return JSONObject.toJSONString(collegeService.pageAllColleges(page, rows));
    }

    /**
     * 编辑、删除学院
     */
    @PostMapping("/editCollege")
    public void editCollege(College college, String action) {
        collegeService.editCollege(college, action);
    }
}