package cc.perlink.Exception;

import cc.perlink.Utils.ResponseMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义异常处理
 */
@ControllerAdvice
public class ExceptionHandler {
//    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public String exceptionHandler(Exception e) {
//        return ResponseMessage.CustomErrorMessages(ErrorCode.INTERNAL_SERVER_ERROR.getStatus(), ErrorCode.BAD_GATEWAY.getCode());
//    }

}
