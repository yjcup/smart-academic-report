package world.xuewei.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import world.xuewei.entity.Meeting;
import world.xuewei.entity.Report;
import world.xuewei.entity.Teacher;

/**
 * <p>
 * ==========================================================================
 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MeetingVo {
    /**
     * 报告
     */
    private Report report;
    /**
     * 报告人
     */
    private Teacher reporter;
    /**
     * 主持人
     */
    private Teacher host;
    /**
     * 会议
     */
    private Meeting meeting;

    /**
     * 预约数
     */
    private int appointmentCount;

    /**
     * 签到数
     */
    private int arriveCount;

    /**
     * 预约百分比 = 预约人数/会议容量 * 100%
     */
    private int appointmentPercent;

    /**
     * 状态【1:已预约】【0:未预约】【2:预约已满】
     */
    private int status;
}