package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (College)实体类
 *
 * <p>
 * ==========================================================================
 
 * @since 2020-12-23 14:00:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College implements Serializable {

    private static final long serialVersionUID = 370311530547536003L;

    /**
     * 学院ID
     */
    private Integer id;

    /**
     * 学院名称
     */
    private String name;

    /**
     * 院长ID【对应职工表】
     */
    private Integer leaderId;

    /**
     * 院长
     */
    private Teacher leader;
}