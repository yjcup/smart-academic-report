package world.xuewei.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应接口
 *
 * <p>
 * ==========================================================================
 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseResult {

    private int code;
    private String message;
    private Object data;
}
