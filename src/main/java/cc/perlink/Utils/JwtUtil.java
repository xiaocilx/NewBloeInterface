package cc.perlink.Utils;


import cc.perlink.Entity.User;
import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    private static final long time = 1000 * 60 * 60 * 24;    // 有效时间设置为1天
    private static final String keys = "hello world"; // 签名字符串

    /**
     * 创建用户Token
     * @param user 用户实体类
     * @return 生成的Token
     */
    public static String createToken(User user) {
        return Jwts.builder()
                // header
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                // payload
                .claim("username", user.getUsername())
                .claim("email", user.getEmail())
                .claim("role", user.getRole())
                .setExpiration(new Date(System.currentTimeMillis() + time)) // 有效时间
                .setId(UUID.randomUUID().toString())    // 设置一个ID
                .setIssuedAt(new Date())    // 签发时间
                .signWith(SignatureAlgorithm.HS256, keys)
                .compact();
    }

    /**
     * 效验Token是否正确
     * @param token 用户Token
     * @return 布尔值
     */
    public static Boolean checkToken(String token) {
        if (token == null) {
            return false;
        }
        try {
            Jwt parse = Jwts
                    .parser()
                    .setSigningKey(keys)
                    .parse(token);
        } catch (Exception err) {
            return false;
        }
        return true;
    }


}