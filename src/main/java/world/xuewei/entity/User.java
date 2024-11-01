package world.xuewei.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * ==========================================================================
 
 * @ClassName: User
 * 用户实体
 * @date 2020/11/27 8:55
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    /**
     * ID
     */
    private Integer id;
    /**
     * 编号
     */
    private String no;

    /**
     * 名称
     */
    private String name;

    /**
     * 角色
     */
    private String role;

    /**
     * 头像
     */
    private String img;

    /**
     * 所属学院
     */
    private College college;

    /**
     * 是否为学院领导
     */
    private int isLeader;
}
