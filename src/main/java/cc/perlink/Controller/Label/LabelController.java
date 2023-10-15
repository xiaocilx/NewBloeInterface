package cc.perlink.Controller.Label;

import cc.perlink.Entity.Label;
import cc.perlink.Service.LabelService;
import cc.perlink.Utils.ResponseMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 标签接口
 */
@RestController
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 上传标签
     *
     * @param label 标签实体类
     * @return JSON
     */
    @RequestMapping(value = "PostLabel", method = RequestMethod.POST)
    @ApiOperation(value = "上传标签")
    public String PostLabel(@RequestBody Label label) {
        return labelService.insertLabel(label);
    }

    /**
     * 获取所有标签
     *
     * @return JSON
     */
    @RequestMapping(value = "AllLabel", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有标签")
    public String AllLabel() {
        return labelService.GetAllLabel();
    }

    /**
     * 获取所有标签（唯一）
     *
     * @return JSON
     */
    @RequestMapping(value = "AllUniqueLabel", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有标签（唯一）")
    public String AllUniqueLabel() {
        return labelService.GetAllUniqueLabel();
    }


}
