package world.xuewei.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import world.xuewei.constant.ReportConstant;
import world.xuewei.controller.BaseController;
import world.xuewei.entity.Meeting;
import world.xuewei.entity.Report;

import java.util.List;

/**
 * 报告会议定时任务
 *
 * <p>
 * ==========================================================================
 
 */
@Service
public class MeetingTask extends BaseController {

    /**
     * 每隔一分钟检查会议的状态
     */
    @Scheduled(cron = "0/6000 * * * * *")
    public void checkMeeting() {
        //  获取全部的学术报告
        List<Meeting> meetings = meetingService.listMeetings();
        for (Meeting meeting : meetings) {
            // 获取报告
            Report report = reportService.getById(meeting.getReportId());
            if (ReportConstant.FINISHED.equals(report.getStatus())) {
                continue;
            }
            if (System.currentTimeMillis() > meeting.getAppointmentEnd().getTime()) {
                // 设置报告的状态为已完成
                report.setStatus(ReportConstant.FINISHED);
                reportService.update(report);
            }
        }
    }
}
