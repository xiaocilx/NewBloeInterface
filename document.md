# 文件树

    cc
    |-- perlink
        |-- Controller       // 存放控制器类
        |-- Service          // 存放业务逻辑接口及实现类
        |-- Entity           // 存放实体类
        |-- Dao              // 存放数据传输对象
        |-- Exception        // 存放自定义异常类
        |-- Config           // 存放配置类
        |-- Utils            // 存放工具类
        |-- Main.java        // Spring Boot 应用的入口类

# 错误码

400 - Bad Request: 该状态码表示服务器无法理解客户端发送的请求。这通常是由于客户端发送的请求中包含语法错误导致的，例如，无效的
JSON 格式或缺少必需的字段等。这是一个通用的错误状态码，可以用于多种类型的客户端请求错误。

422 - Unprocessable Entity： 该状态码表示服务器理解请求实体的内容类型，但是请求实体无法被处理。这通常用于表明客户端提交的数据格式正确，但是在服务器端处理时存在错误，例如，数据验证失败。

415 - Unsupported Media Type： 如果客户端上传的内容类型（Media Type）不受支持，服务器可以返回这个状态码。客户端可以通过检查
Accept 头部和确保请求的 Content-Type 是支持的类型来解决这个问题。

429 - Too Many Requests： 如果客户端提交请求的速率超过服务器处理的速率限制，服务器可以返回这个状态码，表示客户端应该减缓请求的频率。

500 - Internal Server Error： 表示服务器遇到了一个未知的异常情况，无法处理请求。

503 - Service Unavailable： 表示服务器当前无法处理请求。这通常是由于服务器过载或正在进行维护。

504 - Gateway Timeout： 表示在服务器作为网关或代理时，未及时从上游服务器或其他辅助服务器收到请求。

502 - Bad Gateway： 表示服务器作为网关或代理，从上游服务器接收到无效的响应。


# 数据库表

1、用户 User

2、文章 Article

3、平均 Discuss

4、标签 Label

5、链接 Link

6、文件 File

7、分类 Sort

8、设置 Option

# 配置变量
1、email 邮箱

2、appPassword 邮箱授权码

