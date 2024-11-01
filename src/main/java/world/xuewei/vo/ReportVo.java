package world.xuewei.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class ReportVo {
    /**
     * 报告
     */
    private Report report;
    /**
     * 作者
     */
    private Teacher teacher;

}
