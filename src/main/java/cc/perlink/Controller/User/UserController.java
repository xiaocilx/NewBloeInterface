package cc.perlink.Controller.User;

import cc.perlink.Entity.User;
import cc.perlink.Service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "Login", method = RequestMethod.POST)
    @ApiOperation("用户登录")
    public String Login(@RequestBody User user) {
        return userService.Login(user.getEmail(), user.getPassword());
    }


}
