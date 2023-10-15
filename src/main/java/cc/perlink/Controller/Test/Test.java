package cc.perlink.Controller.Test;

import cc.perlink.Entity.Article;
import cc.perlink.Entity.User;
import cc.perlink.Utils.ResponseMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ApiOperation("测试接口")
    public String TestMapping() {
        User user = new User();
        user.setPassword("123");
        user.setUsername("admin");
        return ResponseMessage.succeed(user);
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ApiOperation("测试接口2")
    public String TestMapping2() {
        int a = 10 / 0;
        User user = new User();
        user.setPassword("123");
        user.setUsername("admin");
        return ResponseMessage.succeed(user);
    }




}
