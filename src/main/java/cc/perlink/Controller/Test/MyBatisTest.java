package cc.perlink.Controller.Test;

import cc.perlink.Dao.LabelDao;
import cc.perlink.Entity.Label;
import cc.perlink.Service.LabelService;
import cc.perlink.Utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * MyBatis-Plus 使用测试
 */
@RestController
public class MyBatisTest {
    @Autowired
    private LabelDao labelDao;


    @RequestMapping(value = "test3",method = RequestMethod.GET)
    public String Test(){
        Label label = new Label();
        label.setName("张三");
        System.out.println(label);
        labelDao.insert(label);
        System.out.println("ok");
        return ResponseMessage.succeed(null);
    }



}

