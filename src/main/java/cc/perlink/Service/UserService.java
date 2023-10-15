package cc.perlink.Service;

import cc.perlink.Dao.UserDao;
import cc.perlink.Entity.User;
import cc.perlink.Exception.ErrorCode;
import cc.perlink.Utils.ResponseMessage;
import cc.perlink.Utils.VerificationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String Login(String email, String password) {
        // TODO 对于用户信息进行验证


        // TODO 开始进行与数据库对比


        return null;
    }

    public String Register(String email, String password) {
        // TODO 对于用户信息进行验证


        return null;
    }

    public String Update(User user) {
        return null;
    }

    private static String UserInfoValidator(String email, String password) {
        // TODO 电子邮箱格式不通过
        if (!VerificationUtil.EmailValidator(email)) {
            return ResponseMessage.CustomErrorMessages("电子邮箱格式错误", ErrorCode.UNPROCESSABLE_ENTITY.getCode());
        }
        if (!VerificationUtil.PasswordValidator(password)) {
            return ResponseMessage.CustomErrorMessages("密码格式错误", ErrorCode.UNPROCESSABLE_ENTITY.getCode());
        }
        return ResponseMessage.succeed(null);
    }


}
