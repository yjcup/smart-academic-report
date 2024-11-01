package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Meeting)实体类
 *
 * <p>
 * ==========================================================================
 
 * @since 2020-12-20 15:49:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meeting implements Serializable {

    private static final long serialVersionUID = 877299606472764277L;

    /**
     * 会议ID
     */
    private Integer id;

    /**
     * 报告ID
     */
    private Integer reportId;

    /**
     * 报告教师id
     */
    private Integer reporterId;

    /**
     * 主持人教师ID
     */
    private Integer presenterId;

    /**
     * 报告时间
     */
    private Date reportTime;

    /**
     * 报告地点
     */
    private String address;

    /**
     * 预约截止时间
     */
    private Date appointmentEnd;

    /**
     * 最大容纳人数
     */
    private Integer capacity;

}