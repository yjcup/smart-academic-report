package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import world.xuewei.constant.Photo;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * <p>
 * ==========================================================================
 
 * @since 2020-12-20 15:53:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department implements Serializable {

    private static final long serialVersionUID = 719806364595412025L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 部门编号
     */
    private String no;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门部长ID
     */
    private Integer leaderId;

    /**
     * 学院ID
     */
    private Integer collegeId;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 头像
     */
    private String img = Photo.department;

    /**
     * 部长
     */
    private Teacher leader;

    /**
     * 学院
     */
    private College college;

}