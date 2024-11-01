package world.xuewei.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import world.xuewei.entity.Appointment;
import world.xuewei.entity.Student;

/**
 * <p>
 * ==========================================================================
 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentVo {
    private Student student;
    private MeetingVo meetingVo;
    private Appointment appointment;
}