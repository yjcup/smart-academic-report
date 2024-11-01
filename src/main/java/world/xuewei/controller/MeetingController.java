package world.xuewei.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.dto.ResponseResult;

/**
 * 会议控制器
 *
 * <p>
 * ==========================================================================
 
 */
@RestController
public class MeetingController extends BaseController {

    /**
     * 安排报告会议
     */
    @PostMapping("/arrangeMeeting")
    public ResponseResult arrangeMeeting(@RequestParam("id") Integer id, @RequestParam("hostNo") String hostNo,
                                         @RequestParam("reportTime") String reportTime, @RequestParam("reportAddress") String reportAddress,
                                         @RequestParam("appointEnd") String appointEnd, @RequestParam("capacity") Integer capacity) {
        return meetingService.arrangeMeeting(id, hostNo, reportTime, reportAddress, appointEnd, capacity);
    }

    /**
     * 更新报告会议
     */
    @PostMapping("/updateMeeting")
    public ResponseResult updateMeeting(@RequestParam("meetingId") Integer meetingId, @RequestParam("hostNo") String hostNo,
                                        @RequestParam("reportTime") String reportTime, @RequestParam("reportAddress") String reportAddress,
                                        @RequestParam("appointEnd") String appointEnd, @RequestParam("capacity") Integer capacity) {
        return meetingService.updateMeeting(meetingId, hostNo, reportTime, reportAddress, appointEnd, capacity);
    }

    /**
     * 学生预约会议
     */
    @PostMapping("/applyMeeting")
    public ResponseResult applyMeeting(@RequestParam("id") Integer id) {
        return meetingService.applyMeeting(id, loginUser);
    }
}
