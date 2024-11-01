package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Appointment)实体类
 *
 * <p>
 * ==========================================================================
 
 * @since 2021-01-11 20:41:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment implements Serializable {

    private static final long serialVersionUID = 827721937429118051L;

    /**
     * 预约ID
     */
    private Integer id;

    /**
     * 会议ID
     */
    private Integer meetingId;

    /**
     * 学生ID
     */
    private Integer studentId;

    /**
     * 预约时间
     */
    private Date appointmentTime;

    /**
     * 是否到场【1：是】【0：否】
     */
    private Integer present;

}