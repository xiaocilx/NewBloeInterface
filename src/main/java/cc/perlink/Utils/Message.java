package cc.perlink.Utils;

import lombok.Data;

/**
 * 信息类
 *
 * @param <T> 枚举
 */
@Data
public class Message<T> {
    private String message; // 返回的信息
    private String status;  // 状态 error或succeed
    private Integer code; // 状态码
    private T result; // 响应的数据体

    /**
     * 失败
     *
     * @param code 状态码
     */
    public void ControlsError(Integer code) {
        this.code = code;
        this.status = "error";
        this.message = "操作失败";

    }

    /**
     * 成功
     *
     * @param result 响应的数据体
     */
    public void ControlsSucceed(T result) {
        this.code = 200;
        this.status = "succeed";
        this.message = "操作成功";
        this.result = result;
    }



}
