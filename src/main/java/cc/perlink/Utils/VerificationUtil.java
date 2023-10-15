package cc.perlink.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证工具类
 */
public class VerificationUtil {

    /**
     * 验证电子邮箱
     *
     * @param email 邮箱
     * @return 布尔值
     */
    public static boolean EmailValidator(String email) {
        // 定义邮箱格式的正则表达式
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // 创建 Pattern 对象
        Pattern pattern = Pattern.compile(emailRegex);
        // 创建 matcher 对象
        Matcher matcher = pattern.matcher(email);
        // 判断是否匹配
        return matcher.matches();

    }

    /**
     * 验证密码，要求如下
     * 不少于8个字符
     * 至少包含一个小写字母
     * 至少包含一个数字
     * 不包含可能导致安全漏洞的特殊符号
     *
     * @param password 用户密码
     * @return 布尔值
     */

    public static boolean PasswordValidator(String password) {
        // 密码长度至少为8个字符，包含至少一个小写字母和一个数字
        // 不包含可能导致安全漏洞的特殊字符
        String passwordRegex = "^(?=.*[a-z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        // 创建 Pattern 对象
        Pattern pattern = Pattern.compile(passwordRegex);
        // 创建 matcher 对象
        Matcher matcher = pattern.matcher(password);
        // 判断是否匹配
        return matcher.matches();
    }

}
