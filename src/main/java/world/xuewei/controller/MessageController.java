package world.xuewei.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.dto.ResponseResult;

/**
 * (Message)表控制层
 *
 * <p>
 * ==========================================================================
 
 * @since 2021-01-24 22:16:43
 */
@RestController
public class MessageController extends BaseController {

    /**
     * 全部删除
     */
    @PostMapping("/deleteAllMessages")
    public ResponseResult deleteAllMessages() {
        if (messageService.deleteAllByTeacherId(loginUser.getId())) {
            result.setCode(200);
            result.setMessage("清空成功");
        } else {
            result.setCode(500);
            result.setMessage("没有消息被清空");
        }
        return result;
    }

}