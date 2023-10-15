package cc.perlink.Controller.Article;

import cc.perlink.Entity.Article;
import cc.perlink.Utils.ResponseMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章接口
 */
@RestController
public class ArticleController {

    /**
     * 上传文章
     * @param article 文章实体
     * @return JSON
     */
    @RequestMapping(value = "/PostArticle",method = RequestMethod.POST)
    @ApiOperation(value = "上传文章")
    public String PostArticle(@RequestBody Article article){
        return ResponseMessage.succeed(null);
    }

    /**
     * 通过文章ID删除文章
     * @param article 文章ID
     * @return JSON
     */
    @RequestMapping(value = "/DelArticle",method = RequestMethod.POST)
    @ApiOperation(value = "通过文章ID删除文章")
    public String DelArticle(@RequestBody Article article){
        return ResponseMessage.succeed(null);
    }


    /**
     * 获取所有文章
     * @return JSON
     */
    @RequestMapping(value = "/GetAllArticle",method = RequestMethod.GET)
    @ApiOperation(value = "获取所有文章")
    public String GetAllArticle() {
        return ResponseMessage.succeed(null);
    }

    /**
     * 通过ID获取具体某一篇文章
     * @param article 文章ID
     * @return JSON
     */
    @RequestMapping(value = "/GetArticle",method = RequestMethod.POST)
    @ApiOperation(value = "通过ID获取具体某一篇文章")
    public String GetArticle(@RequestBody Article article){
        return ResponseMessage.succeed(article);
    }








}
