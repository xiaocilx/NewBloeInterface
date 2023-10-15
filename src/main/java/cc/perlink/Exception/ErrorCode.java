package cc.perlink.Exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // 客户端错误
    BAD_REQUEST(400, "请求错误", "服务器无法理解请求。"),
    UNPROCESSABLE_ENTITY(422, "请求实体无法处理", "服务器理解请求实体的内容类型，但是请求实体无法被处理。"),
    UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型", "服务器不支持请求中发送的媒体类型。"),
    TOO_MANY_REQUESTS(429, "请求过多", "用户在一定时间内发送了太多的请求。"),

    // 服务器错误
    INTERNAL_SERVER_ERROR(500, "服务器内部错误", "服务器遇到了一个未知的异常情况，无法处理请求。"),
    SERVICE_UNAVAILABLE(503, "服务不可用", "服务器当前无法处理请求。"),
    GATEWAY_TIMEOUT(504, "网关超时", "服务器作为网关或代理，未及时从上游服务器或其他辅助服务器收到请求。"),
    BAD_GATEWAY(502, "网关错误", "服务器作为网关或代理，从上游服务器接收到无效的响应。");

    private final Integer code;
    private final String status;
    private final String message;

    ErrorCode(int code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

}
