package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import world.xuewei.constant.Photo;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * <p>
 * ==========================================================================
 
 * @since 2020-12-20 15:49:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin implements Serializable {

    private static final long serialVersionUID = 603001270166502673L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 管理员编号
     */
    private String no;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 头像
     */
    private String img = Photo.admin;

}