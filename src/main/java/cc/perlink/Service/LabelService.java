package cc.perlink.Service;

import cc.perlink.Dao.LabelDao;
import cc.perlink.Entity.Label;
import cc.perlink.Exception.ErrorCode;
import cc.perlink.Utils.ResponseMessage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    /**
     * 插入一条标签
     *
     * @param label 标签实体
     * @return JSON
     */
    public String insertLabel(Label label) {
        if (label.getName() == null || label.getName().isEmpty()) {
            return ResponseMessage.CustomErrorMessages("标签内容不能为空", ErrorCode.BAD_REQUEST.getCode());
        }
        try {
            labelDao.insert(label);
        } catch (Exception error) {
            return ResponseMessage.error(ErrorCode.INTERNAL_SERVER_ERROR.getCode());
        }

        return ResponseMessage.succeed(null);
    }

    /**
     * 获取所有标签
     *
     * @return JSON
     */
    public String GetAllLabel() {
        List<Label> labels = labelDao.selectList(null);
        return ResponseMessage.succeed(labels);
    }

    /**
     * 查找所有唯一的标签
     *
     * @return JSON
     */
    public String GetAllUniqueLabel() {
        QueryWrapper<Label> wrapper = new QueryWrapper<>();
        wrapper.select("name").groupBy("name");
        List<Label> labels = labelDao.selectList(wrapper);
        return ResponseMessage.succeed(labels);
    }


}
