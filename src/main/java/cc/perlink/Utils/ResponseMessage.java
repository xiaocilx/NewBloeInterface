package cc.perlink.Utils;

import com.alibaba.fastjson.JSON;
import io.swagger.models.auth.In;

/**
 * 返回响应信息 error 或者 succeed
 */
public class ResponseMessage {


    /**
     * 返回成功消息
     *
     * @param result 响应的数据体
     * @return 格式化好的JSON数据
     */
    public static String succeed(Object result) {
        Message<Object> msg = new Message<>();
        msg.ControlsSucceed(result);
        return JSON.toJSONString(msg);
    }

    /**
     * 返回失败消息
     *
     * @param code 状态码
     * @return 格式化好的JSON数据
     */
    public static String error(Integer code) {
        Message<Object> msg = new Message<>();
        msg.ControlsError(code);
        return JSON.toJSONString(msg);
    }

    /**
     * 自定义错误信息
     *
     * @param message 返回的信息
     * @param code    状态码
     * @return 格式化好的JSON数据
     */
    public static String CustomErrorMessages(String message, Integer code) {
        Message<Object> msg = new Message<>();
        msg.setStatus("error");
        msg.setMessage(message);
        msg.setCode(code);
        return JSON.toJSONString(msg);
    }


}
